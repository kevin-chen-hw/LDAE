// $ANTLR 2.7.7 (20060906): "order-by-render.g" -> "GeneratedOrderByFragmentRenderer.java"$

/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2008, Red Hat Middleware LLC or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Middleware LLC.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 *
 */
package org.hibernate.sql.ordering.antlr;

import antlr.TreeParser;
import antlr.Token;
import antlr.collections.AST;
import antlr.RecognitionException;
import antlr.ANTLRException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.collections.impl.BitSet;
import antlr.ASTPair;
import antlr.collections.impl.ASTArray;


/**
 * Antlr grammar for rendering <tt>ORDER_BY</tt> trees as described by the {@link OrderByFragmentParser}

 * @author Steve Ebersole
 * @author Lukasz Antoniak (lukasz dot antoniak at gmail dot com)
 */
public class GeneratedOrderByFragmentRenderer extends antlr.TreeParser       implements GeneratedOrderByFragmentRendererTokenTypes
 {

    // the buffer to which we write the resulting SQL.
	private StringBuilder buffer = new StringBuilder();

	protected void out(String text) {
	    buffer.append( text );
	}

	protected void out(AST ast) {
	    buffer.append( ast.getText() );
	}

    /*package*/ String getRenderedFragment() {
        return buffer.toString();
    }

	/**
	 * Implementation note: This is just a stub. OrderByFragmentRenderer contains the effective implementation.
	 */
	protected String renderOrderByElement(String expression, String collation, String order, String nulls) {
		throw new UnsupportedOperationException("Concrete ORDER BY renderer should override this method.");
	}
public GeneratedOrderByFragmentRenderer() {
	tokenNames = _tokenNames;
}

	public final void orderByFragment(AST _t) throws RecognitionException {
		
		AST orderByFragment_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		try {      // for error handling
			AST __t2 = _t;
			AST tmp1_AST_in = (AST)_t;
			match(_t,ORDER_BY);
			_t = _t.getFirstChild();
			sortSpecification(_t);
			_t = _retTree;
			{
			_loop4:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==SORT_SPEC)) {
					out(", ");
					sortSpecification(_t);
					_t = _retTree;
				}
				else {
					break _loop4;
				}
				
			} while (true);
			}
			_t = __t2;
			_t = _t.getNextSibling();
		}
		catch (RecognitionException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
	}
	
	public final void sortSpecification(AST _t) throws RecognitionException {
		
		AST sortSpecification_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		String sortKeySpec = null; String collSpec = null; String ordSpec = null; String nullOrd = null;
		
		try {      // for error handling
			AST __t6 = _t;
			AST tmp2_AST_in = (AST)_t;
			match(_t,SORT_SPEC);
			_t = _t.getFirstChild();
			sortKeySpec=sortKeySpecification(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case COLLATE:
			{
				collSpec=collationSpecification(_t);
				_t = _retTree;
				break;
			}
			case 3:
			case ORDER_SPEC:
			case NULL_ORDER:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case ORDER_SPEC:
			{
				ordSpec=orderingSpecification(_t);
				_t = _retTree;
				break;
			}
			case 3:
			case NULL_ORDER:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case NULL_ORDER:
			{
				nullOrd=nullOrdering(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			out( renderOrderByElement( sortKeySpec, collSpec, ordSpec, nullOrd ) );
			_t = __t6;
			_t = _t.getNextSibling();
		}
		catch (RecognitionException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
	}
	
	public final String  sortKeySpecification(AST _t) throws RecognitionException {
		String sortKeyExp = null;
		
		AST sortKeySpecification_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST s = null;
		
		try {      // for error handling
			AST __t11 = _t;
			AST tmp3_AST_in = (AST)_t;
			match(_t,SORT_KEY);
			_t = _t.getFirstChild();
			s = _t==ASTNULL ? null : (AST)_t;
			sortKey(_t);
			_t = _retTree;
			_t = __t11;
			_t = _t.getNextSibling();
			sortKeyExp = s.getText();
		}
		catch (RecognitionException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
		return sortKeyExp;
	}
	
	public final String  collationSpecification(AST _t) throws RecognitionException {
		String collSpecExp = null;
		
		AST collationSpecification_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST c = null;
		
		try {      // for error handling
			c = (AST)_t;
			match(_t,COLLATE);
			_t = _t.getNextSibling();
			collSpecExp = "collate " + c.getText();
		}
		catch (RecognitionException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
		return collSpecExp;
	}
	
	public final String  orderingSpecification(AST _t) throws RecognitionException {
		String ordSpecExp = null;
		
		AST orderingSpecification_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST o = null;
		
		try {      // for error handling
			o = (AST)_t;
			match(_t,ORDER_SPEC);
			_t = _t.getNextSibling();
			ordSpecExp = o.getText();
		}
		catch (RecognitionException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
		return ordSpecExp;
	}
	
	public final String  nullOrdering(AST _t) throws RecognitionException {
		String nullOrdExp = null;
		
		AST nullOrdering_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST n = null;
		
		try {      // for error handling
			n = (AST)_t;
			match(_t,NULL_ORDER);
			_t = _t.getNextSibling();
			nullOrdExp = n.getText();
		}
		catch (RecognitionException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
		return nullOrdExp;
	}
	
	public final void sortKey(AST _t) throws RecognitionException {
		
		AST sortKey_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		try {      // for error handling
			AST tmp4_AST_in = (AST)_t;
			match(_t,IDENT);
			_t = _t.getNextSibling();
		}
		catch (RecognitionException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"ORDER_BY",
		"SORT_SPEC",
		"ORDER_SPEC",
		"NULL_ORDER",
		"SORT_KEY",
		"EXPR_LIST",
		"DOT",
		"IDENT_LIST",
		"COLUMN_REF",
		"\"collate\"",
		"\"asc\"",
		"\"desc\"",
		"\"nulls\"",
		"FIRST",
		"LAST",
		"COMMA",
		"HARD_QUOTE",
		"IDENT",
		"OPEN_PAREN",
		"CLOSE_PAREN",
		"NUM_DOUBLE",
		"NUM_FLOAT",
		"NUM_INT",
		"NUM_LONG",
		"QUOTED_STRING",
		"\"ascending\"",
		"\"descending\"",
		"ID_START_LETTER",
		"ID_LETTER",
		"ESCqs",
		"HEX_DIGIT",
		"EXPONENT",
		"FLOAT_SUFFIX",
		"WS"
	};
	
	}
	
