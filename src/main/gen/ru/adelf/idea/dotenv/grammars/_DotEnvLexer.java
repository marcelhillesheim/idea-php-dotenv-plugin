/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package ru.adelf.idea.dotenv.grammars;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import ru.adelf.idea.dotenv.psi.DotEnvTypes;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>DotEnvLexer.flex</tt>
 */
class _DotEnvLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int WAITING_KEY = 2;
  public static final int WAITING_VALUE = 4;
  public static final int WAITING_QUOTED_VALUE = 6;
  public static final int WAITING_SINGLE_QUOTED_VALUE = 8;
  public static final int WAITING_COMMENT = 10;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5, 5
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\4\1\2\1\1\1\5\1\3\22\0\1\7\1\0\1\12\1\11\3\0\1\6\22\0\1\13\2\0\1\13"+
    "\7\0\1\14\11\0\1\17\1\16\1\0\1\20\1\0\1\21\3\0\1\15\3\0\1\10\10\0\1\14\11"+
    "\0\1\17\1\16\1\0\1\20\1\0\1\21\3\0\1\15\14\0\1\1\242\0\2\1\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\6\0\2\1\1\2\1\3\1\4\1\5\1\1\1\3"+
    "\2\6\2\7\1\10\1\7\1\3\1\11\1\12\1\13"+
    "\1\3\1\14\1\15\1\3\3\11\1\0\2\4\1\1"+
    "\1\2\1\6\2\0\1\2\4\1\1\16";

  private static int [] zzUnpackAction() {
    int [] result = new int[45];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\22\0\44\0\66\0\110\0\132\0\154\0\176"+
    "\0\220\0\242\0\264\0\306\0\330\0\306\0\352\0\374"+
    "\0\u010e\0\220\0\306\0\u0120\0\u0132\0\306\0\306\0\u0144"+
    "\0\u0156\0\306\0\u0168\0\u017a\0\u018c\0\u019e\0\u01b0\0\242"+
    "\0\u01c2\0\u01d4\0\u01e6\0\374\0\u01f8\0\u0156\0\u017a\0\u019e"+
    "\0\u020a\0\u021c\0\u022e\0\u0240\0\u0252";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[45];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\7\1\10\1\11\1\10\2\11\1\7\1\11\1\12"+
    "\1\13\1\7\1\14\1\15\6\7\1\10\1\11\1\10"+
    "\2\11\1\7\1\11\1\12\2\7\1\16\6\7\1\17"+
    "\1\20\2\11\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\7\17\10\30\1\31\1\30\1\32\7\30\6\33"+
    "\1\32\1\33\1\34\11\33\1\35\1\36\2\11\1\37"+
    "\1\36\1\35\1\37\12\35\2\7\1\0\1\7\2\0"+
    "\1\7\1\0\1\40\2\7\1\0\7\7\1\10\1\11"+
    "\1\10\2\11\1\7\1\11\1\40\2\7\1\0\6\7"+
    "\1\0\5\11\1\0\1\11\21\0\1\7\12\0\2\13"+
    "\1\0\1\7\2\41\1\13\1\41\1\42\2\13\1\41"+
    "\6\13\22\0\2\7\1\0\1\7\2\0\1\7\1\0"+
    "\1\40\2\7\1\0\1\7\1\43\4\7\2\17\2\0"+
    "\5\17\1\0\11\17\1\44\2\11\2\44\1\17\1\44"+
    "\1\17\1\0\11\17\1\45\2\11\2\21\1\17\1\21"+
    "\1\17\1\0\10\17\1\0\3\11\2\24\1\0\1\24"+
    "\12\0\1\17\3\0\1\17\1\0\14\17\10\30\1\46"+
    "\1\30\1\0\10\30\3\0\1\30\1\0\14\30\6\33"+
    "\1\0\1\33\1\47\12\33\3\0\1\33\1\0\14\33"+
    "\2\35\2\0\17\35\1\50\2\11\2\50\1\35\1\50"+
    "\13\35\1\37\2\11\2\37\1\35\1\37\12\35\2\41"+
    "\2\0\20\41\2\0\3\41\1\13\12\41\2\7\1\0"+
    "\1\7\2\0\1\7\1\0\1\40\2\7\1\0\2\7"+
    "\1\51\3\7\1\17\1\45\2\11\2\45\1\17\1\45"+
    "\1\17\1\0\10\17\2\7\1\0\1\7\2\0\1\7"+
    "\1\0\1\40\2\7\1\0\3\7\1\52\4\7\1\0"+
    "\1\7\2\0\1\7\1\0\1\40\2\7\1\0\4\7"+
    "\1\53\3\7\1\0\1\7\2\0\1\7\1\0\1\40"+
    "\2\7\1\0\5\7\1\54\2\7\1\0\1\7\2\0"+
    "\1\7\1\55\1\40\2\7\1\0\6\7\7\0\1\55"+
    "\12\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[612];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\6\0\5\1\1\11\1\1\1\11\4\1\1\11\2\1"+
    "\2\11\2\1\1\11\5\1\1\0\5\1\2\0\6\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[45];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  _DotEnvLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { yybegin(YYINITIAL); return DotEnvTypes.KEY_CHARS;
            } 
            // fall through
          case 15: break;
          case 2: 
            { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 16: break;
          case 3: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 17: break;
          case 4: 
            { yybegin(YYINITIAL); return DotEnvTypes.COMMENT;
            } 
            // fall through
          case 18: break;
          case 5: 
            { yybegin(WAITING_VALUE); return DotEnvTypes.SEPARATOR;
            } 
            // fall through
          case 19: break;
          case 6: 
            { yybegin(YYINITIAL); return DotEnvTypes.VALUE_CHARS;
            } 
            // fall through
          case 20: break;
          case 7: 
            { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 21: break;
          case 8: 
            { yybegin(WAITING_SINGLE_QUOTED_VALUE); return DotEnvTypes.QUOTE;
            } 
            // fall through
          case 22: break;
          case 9: 
            { yybegin(WAITING_COMMENT); return DotEnvTypes.COMMENT;
            } 
            // fall through
          case 23: break;
          case 10: 
            { yybegin(WAITING_QUOTED_VALUE); return DotEnvTypes.QUOTE;
            } 
            // fall through
          case 24: break;
          case 11: 
            { yybegin(WAITING_QUOTED_VALUE); return DotEnvTypes.VALUE_CHARS;
            } 
            // fall through
          case 25: break;
          case 12: 
            { yybegin(WAITING_COMMENT); return DotEnvTypes.QUOTE;
            } 
            // fall through
          case 26: break;
          case 13: 
            { yybegin(WAITING_SINGLE_QUOTED_VALUE); return DotEnvTypes.VALUE_CHARS;
            } 
            // fall through
          case 27: break;
          case 14: 
            { yybegin(WAITING_KEY); return DotEnvTypes.EXPORT;
            } 
            // fall through
          case 28: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
