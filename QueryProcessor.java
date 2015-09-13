package query_processor;

import java.util.*;

import org.antlr.runtime.*;

import java.io.*;
import java.nio.charset.*;

public class QueryProcessor {

	public static void main(String[] args) throws IOException, RecognitionException {
		System.out.println("urSQL CLI\n");
		boolean flag = true;
		while (flag) {
			Scanner scanner = new Scanner(System.in);
			System.out.print(">>> ");
			String query = scanner.nextLine();
			if (query.equals("exit")) {
				flag = false;
			} else {
				InputStream stream = new ByteArrayInputStream(query.getBytes(StandardCharsets.UTF_8));
				ANTLRInputStream input = new ANTLRInputStream(stream);
				urSQLLexer lexer = new urSQLLexer(input);
				CommonTokenStream tokens = new CommonTokenStream((TokenSource) lexer);
				urSQLParser parser = new urSQLParser(tokens);
				parser.programa();
			}
		}

	}

}
