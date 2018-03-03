package ru.adelf.idea.dotenv.go;

import com.goide.psi.GoCallExpr;
import com.goide.psi.GoStringLiteral;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.codeInsight.navigation.actions.GotoDeclarationHandler;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.editor.Editor;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.adelf.idea.dotenv.api.EnvironmentVariablesApi;
import ru.adelf.idea.dotenv.common.BaseEnvCompletionProvider;

public class GoEnvCompletionProvider extends BaseEnvCompletionProvider implements GotoDeclarationHandler {
    public GoEnvCompletionProvider() {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(), new CompletionProvider<CompletionParameters>() {
            @Override
            protected void addCompletions(@NotNull CompletionParameters completionParameters, ProcessingContext processingContext, @NotNull CompletionResultSet completionResultSet) {

                PsiElement psiElement = completionParameters.getOriginalPosition();
                if(psiElement == null || getStringLiteral(psiElement) == null) {
                    return;
                }

                fillCompletionResultSet(completionResultSet, psiElement.getProject());
            }
        });
    }

    @Nullable
    @Override
    public PsiElement[] getGotoDeclarationTargets(@Nullable PsiElement psiElement, int i, Editor editor) {

        if(psiElement == null) {
            return new PsiElement[0];
        }

        GoStringLiteral stringLiteral = getStringLiteral(psiElement);

        if(stringLiteral == null) {
            return new PsiElement[0];
        }

        return EnvironmentVariablesApi.getKeyDeclarations(psiElement.getProject(), stringLiteral.getDecodedText());
    }

    @Nullable
    private GoStringLiteral getStringLiteral(@NotNull PsiElement psiElement) {
        PsiElement parent = psiElement.getParent();

        if(!(parent instanceof GoStringLiteral)) {
            return null;
        }

        if(parent.getParent() == null) {
            return null;
        }

        PsiElement candidate = parent.getParent().getParent();

        if(candidate instanceof GoCallExpr) {
            GoCallExpr callExpression = (GoCallExpr) candidate;
            if(GoPsiHelper.checkEnvMethodCall(callExpression)
                    && callExpression.getArgumentList().getExpressionList().size() > 0
                    && callExpression.getArgumentList().getExpressionList().get(0).isEquivalentTo(parent)) {

                return (GoStringLiteral) parent;
            }

            return null;
        }

        return null;
    }

    @Nullable
    @Override
    public String getActionText(DataContext dataContext) {
        return null;
    }
}