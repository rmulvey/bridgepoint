/*
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.xtext.masl.parser.antlr.lexer.jflex;

import java.io.CharArrayReader;
import java.io.Reader;
import java.lang.reflect.Field;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.xtuml.bp.xtext.masl.parser.antlr.lexer.InternalMASLLexer;

public class JFlexBasedInternalMASLLexer extends InternalMASLLexer {
	MASLFlexer delegate = new MASLFlexer((Reader)null);
	
	public JFlexBasedInternalMASLLexer(CharStream stream) {
		super(stream);
	}			
	
	public JFlexBasedInternalMASLLexer() {
		super();
	}
				
	@Override
	public void mTokens() throws RecognitionException {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public CharStream getCharStream() {
		return new ANTLRStringStream(data, data.length);
	}
	
	@Override
	public Token nextToken() {
		return delegate.nextToken();
	}
	
	char[] data = null;
	int data_length = -1;
	
	@Override
	public void setCharStream(CharStream input) {
		try {
			Field field = ANTLRStringStream.class.getDeclaredField("data");
			Field field_n = ANTLRStringStream.class.getDeclaredField("n");
			field.setAccessible(true);
			field_n.setAccessible(true);
			data = (char[]) field.get(input);
			data_length = (Integer) field_n.get(input);
			reset();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void reset() {
		delegate.reset(new CharArrayReader(data, 0, data_length));
	}
}
