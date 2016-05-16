// $ANTLR 2.7.7 (20060906): "sql-stmt.g" -> "SqlStatementParser.java"$

package org.hibernate.hql.internal.antlr;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

import org.hibernate.hql.internal.ast.ErrorReporter;

import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.ANTLRException;
import antlr.LLkParser;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;

/**
 * Lexer and parser used to extract single statements from import SQL script. Supports instructions/comments and quoted
 * strings spread over multiple lines. Each statement must end with semicolon.
 *
 * @author Lukasz Antoniak (lukasz dot antoniak at gmail dot com)
 */
public class SqlStatementParser extends antlr.LLkParser       implements SqlStatementParserTokenTypes
 {

    private ErrorHandler errorHandler = new ErrorHandler();

    @Override
    public void reportError(RecognitionException e) {
        errorHandler.reportError( e );
    }

    @Override
    public void reportError(String s) {
        errorHandler.reportError( s );
    }

    @Override
    public void reportWarning(String s) {
        errorHandler.reportWarning( s );
    }

    public void throwExceptionIfErrorOccurred() {
        if ( errorHandler.hasErrors() ) {
            throw new StatementParserException( errorHandler.getErrorMessage() );
        }
    }

    /** List of all SQL statements. */
    private List<String> statementList = new LinkedList<String>();

    /** Currently processing SQL statement. */
    private StringBuilder current = new StringBuilder();

    protected void out(String stmt) {
        current.append( stmt );
    }

    protected void out(Token token) {
        out( token.getText() );
    }

    public List<String> getStatementList() {
        return statementList;
    }

    protected void statementEnd() {
        statementList.add( current.toString().trim() );
        current = new StringBuilder();
    }

    public class StatementParserException extends RuntimeException {
        public StatementParserException(String message) {
            super( message );
        }
    }

    private class ErrorHandler implements ErrorReporter {
        private List<String> errorList = new LinkedList<String>();

        @Override
        public void reportError(RecognitionException e) {
            reportError( e.toString() );
        }

        @Override
        public void reportError(String s) {
            errorList.add( s );
        }

        @Override
        public void reportWarning(String s) {
        }

        public boolean hasErrors() {
            return !errorList.isEmpty();
        }

        public String getErrorMessage() {
            StringBuilder buf = new StringBuilder();
            for ( Iterator iterator = errorList.iterator(); iterator.hasNext(); ) {
                buf.append( (String) iterator.next() );
                if ( iterator.hasNext() ) {
                    buf.append( "\n" );
                }
            }
            return buf.toString();
        }
    }

protected SqlStatementParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public SqlStatementParser(TokenBuffer tokenBuf) {
  this(tokenBuf,1);
}

protected SqlStatementParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public SqlStatementParser(TokenStream lexer) {
  this(lexer,1);
}

public SqlStatementParser(ParserSharedInputState state) {
  super(state,1);
  tokenNames = _tokenNames;
}

	public final void script() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			{
			_loop3:
			do {
				if (((LA(1) >= NOT_STMT_END && LA(1) <= STMT_END))) {
					statement();
				}
				else {
					break _loop3;
				}
				
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
	}
	
	public final void statement() throws RecognitionException, TokenStreamException {
		
		Token  s = null;
		Token  q = null;
		
		try {      // for error handling
			{
			_loop6:
			do {
				switch ( LA(1)) {
				case NOT_STMT_END:
				{
					s = LT(1);
					match(NOT_STMT_END);
					out( s );
					break;
				}
				case QUOTED_STRING:
				{
					q = LT(1);
					match(QUOTED_STRING);
					out( q );
					break;
				}
				default:
				{
					break _loop6;
				}
				}
			} while (true);
			}
			match(STMT_END);
			statementEnd();
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_1);
		}
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"NOT_STMT_END",
		"QUOTED_STRING",
		"STMT_END",
		"ESCqs",
		"LINE_COMMENT",
		"MULTILINE_COMMENT"
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 2L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 114L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	
	}
