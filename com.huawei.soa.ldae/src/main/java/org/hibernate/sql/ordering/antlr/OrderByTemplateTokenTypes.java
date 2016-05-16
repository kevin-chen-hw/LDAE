// $ANTLR 2.7.7 (20060906): "order-by.g" -> "GeneratedOrderByLexer.java"$

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

public interface OrderByTemplateTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int ORDER_BY = 4;
	int SORT_SPEC = 5;
	int ORDER_SPEC = 6;
	int NULL_ORDER = 7;
	int SORT_KEY = 8;
	int EXPR_LIST = 9;
	int DOT = 10;
	int IDENT_LIST = 11;
	int COLUMN_REF = 12;
	int COLLATE = 13;
	int ASCENDING = 14;
	int DESCENDING = 15;
	int NULLS = 16;
	int FIRST = 17;
	int LAST = 18;
	int COMMA = 19;
	int HARD_QUOTE = 20;
	int IDENT = 21;
	int OPEN_PAREN = 22;
	int CLOSE_PAREN = 23;
	int NUM_DOUBLE = 24;
	int NUM_FLOAT = 25;
	int NUM_INT = 26;
	int NUM_LONG = 27;
	int QUOTED_STRING = 28;
	int LITERAL_ascending = 29;
	int LITERAL_descending = 30;
	int ID_START_LETTER = 31;
	int ID_LETTER = 32;
	int ESCqs = 33;
	int HEX_DIGIT = 34;
	int EXPONENT = 35;
	int FLOAT_SUFFIX = 36;
	int WS = 37;
}
