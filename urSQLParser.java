<<<<<<< HEAD
// $ANTLR 3.5 /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g 2015-09-13 17:39:18
=======
// $ANTLR 3.5 /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g 2015-09-13 00:56:39
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b

	package query_processor;
	import java.io.*;
	import java.util.Vector;
	import java.util.Collections;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class urSQLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "ALL", "ALTER", "AS", "AVERAGE", 
		"BY", "CHAR", "CHARACTER", "COLON", "COMMENT", "CONSTRAINT", "COUNT", 
		"CREATE", "DATABASE", "DATABASES", "DATETIME", "DECIMAL", "DELETE", "DISPLAY", 
		"DROP", "EQUALS", "ESC_SEQ", "EXPONENT", "FLOAT", "FOR", "FOREIGN", "FROM", 
		"GET", "GREATER_EQUALS", "GREATER_THAN", "GROUP", "HEX_DIGIT", "ID", "INDEX", 
		"INSERT", "INT", "INTEGER", "INTO", "IS", "JOIN", "JSON", "KEY", "LEFT_PAR", 
		"LESS_EQUALS", "LESS_THAN", "LIKE", "LIST", "MAX", "MIN", "NEWLINE", "NOT", 
		"NULL", "OCTAL_ESC", "ON", "PRIMARY", "REFERENCES", "RIGHT_PAR", "SELECT", 
		"SET", "START", "STATUS", "STOP", "STRING", "TABLE", "UNICODE_ESC", "UPDATE", 
		"VALUES", "VARCHAR", "WHERE", "WS", "XML"
	};
	public static final int EOF=-1;
	public static final int ADD=4;
	public static final int ALL=5;
	public static final int ALTER=6;
	public static final int AS=7;
	public static final int AVERAGE=8;
	public static final int BY=9;
	public static final int CHAR=10;
	public static final int CHARACTER=11;
	public static final int COLON=12;
	public static final int COMMENT=13;
	public static final int CONSTRAINT=14;
	public static final int COUNT=15;
	public static final int CREATE=16;
	public static final int DATABASE=17;
	public static final int DATABASES=18;
	public static final int DATETIME=19;
	public static final int DECIMAL=20;
	public static final int DELETE=21;
	public static final int DISPLAY=22;
	public static final int DROP=23;
	public static final int EQUALS=24;
	public static final int ESC_SEQ=25;
	public static final int EXPONENT=26;
	public static final int FLOAT=27;
	public static final int FOR=28;
	public static final int FOREIGN=29;
	public static final int FROM=30;
	public static final int GET=31;
	public static final int GREATER_EQUALS=32;
	public static final int GREATER_THAN=33;
	public static final int GROUP=34;
	public static final int HEX_DIGIT=35;
	public static final int ID=36;
	public static final int INDEX=37;
	public static final int INSERT=38;
	public static final int INT=39;
	public static final int INTEGER=40;
	public static final int INTO=41;
	public static final int IS=42;
	public static final int JOIN=43;
	public static final int JSON=44;
	public static final int KEY=45;
	public static final int LEFT_PAR=46;
	public static final int LESS_EQUALS=47;
	public static final int LESS_THAN=48;
	public static final int LIKE=49;
	public static final int LIST=50;
	public static final int MAX=51;
	public static final int MIN=52;
	public static final int NEWLINE=53;
	public static final int NOT=54;
	public static final int NULL=55;
	public static final int OCTAL_ESC=56;
	public static final int ON=57;
	public static final int PRIMARY=58;
	public static final int REFERENCES=59;
	public static final int RIGHT_PAR=60;
	public static final int SELECT=61;
	public static final int SET=62;
	public static final int START=63;
	public static final int STATUS=64;
	public static final int STOP=65;
	public static final int STRING=66;
	public static final int TABLE=67;
	public static final int UNICODE_ESC=68;
	public static final int UPDATE=69;
	public static final int VALUES=70;
	public static final int VARCHAR=71;
	public static final int WHERE=72;
	public static final int WS=73;
	public static final int XML=74;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public urSQLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public urSQLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return urSQLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g"; }


		public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
			String hdr = getErrorHeader(e);
			String[] splt = hdr.split("\\s");
			String tmp = splt[1];
			char c = tmp.charAt(0);
			String lineNumber = "";
			lineNumber += Character.toString(c);
			c = tmp.charAt(1);
			if (!Character.toString(c).equals(":")) {
				lineNumber += Character.toString(c);
			}
			System.out.println("Error 42000: Syntax error or access rule violation in line " + lineNumber);
		}


	protected static class programa_scope {
		Vector<String> type_null;
		Vector<String> column;
		Vector<String> values;
		Vector<String> condition;
		Vector<String> select_columns;
		Vector<String> select_tables;
		Vector<String> select_group;
		Vector<Vector<String>> columns;
		String tmp;
	}
	protected Stack<programa_scope> programa_stack = new Stack<programa_scope>();


	// $ANTLR start "programa"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:34:1: programa : ( clp_commands | ddl_commands | dml_commands );
<<<<<<< HEAD
	public final void programa() throws  {
=======
	public final void programa()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		programa_stack.push(new programa_scope());

			programa_stack.peek().type_null = new Vector<String>();
			programa_stack.peek().column = new Vector<String>();
			programa_stack.peek().values = new Vector<String>();
			programa_stack.peek().condition = new Vector<String>();
			programa_stack.peek().select_columns = new Vector<String>();
			programa_stack.peek().select_tables = new Vector<String>();
			programa_stack.peek().select_group = new Vector<String>();
			programa_stack.peek().columns = new Vector<Vector<String>>();
			programa_stack.peek().tmp = "";

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:59:2: ( clp_commands | ddl_commands | dml_commands )
			int alt1=3;
			switch ( input.LA(1) ) {
			case CREATE:
				{
				int LA1_1 = input.LA(2);
				if ( (LA1_1==DATABASE) ) {
					alt1=1;
				}
				else if ( (LA1_1==INDEX||LA1_1==TABLE) ) {
					alt1=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DROP:
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2==DATABASE) ) {
					alt1=1;
				}
				else if ( (LA1_2==TABLE) ) {
					alt1=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DISPLAY:
			case GET:
			case LIST:
			case START:
			case STOP:
				{
				alt1=1;
				}
				break;
			case EOF:
				{
				alt1=1;
				}
				break;
			case ALTER:
			case SET:
				{
				alt1=2;
				}
				break;
			case DELETE:
			case INSERT:
			case SELECT:
			case UPDATE:
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:59:4: clp_commands
					{
					pushFollow(FOLLOW_clp_commands_in_programa57);
					clp_commands();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:60:4: ddl_commands
					{
					pushFollow(FOLLOW_ddl_commands_in_programa62);
					ddl_commands();
					state._fsp--;

					}
					break;
				case 3 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:61:4: dml_commands
					{
					pushFollow(FOLLOW_dml_commands_in_programa67);
					dml_commands();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			programa_stack.pop();
		}
	}
	// $ANTLR end "programa"



	// $ANTLR start "dml_commands"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:65:1: dml_commands : ( ( select | update | delete | insert ) ( clp_commands | ddl_commands | dml_commands ) |);
<<<<<<< HEAD
	public final void dml_commands() throws  {
=======
	public final void dml_commands()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:66:2: ( ( select | update | delete | insert ) ( clp_commands | ddl_commands | dml_commands ) |)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==DELETE||LA4_0==INSERT||LA4_0==SELECT||LA4_0==UPDATE) ) {
				alt4=1;
			}
			else if ( (LA4_0==EOF) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:66:4: ( select | update | delete | insert ) ( clp_commands | ddl_commands | dml_commands )
					{
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:66:4: ( select | update | delete | insert )
					int alt2=4;
					switch ( input.LA(1) ) {
					case SELECT:
						{
						alt2=1;
						}
						break;
					case UPDATE:
						{
						alt2=2;
						}
						break;
					case DELETE:
						{
						alt2=3;
						}
						break;
					case INSERT:
						{
						alt2=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}
					switch (alt2) {
						case 1 :
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:66:6: select
							{
							pushFollow(FOLLOW_select_in_dml_commands84);
							select();
							state._fsp--;

							}
							break;
						case 2 :
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:67:4: update
							{
							pushFollow(FOLLOW_update_in_dml_commands89);
							update();
							state._fsp--;

							}
							break;
						case 3 :
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:68:4: delete
							{
							pushFollow(FOLLOW_delete_in_dml_commands94);
							delete();
							state._fsp--;

							}
							break;
						case 4 :
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:69:4: insert
							{
							pushFollow(FOLLOW_insert_in_dml_commands99);
							insert();
							state._fsp--;

							}
							break;

					}

					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:69:13: ( clp_commands | ddl_commands | dml_commands )
					int alt3=3;
					switch ( input.LA(1) ) {
					case CREATE:
						{
						int LA3_1 = input.LA(2);
						if ( (LA3_1==DATABASE) ) {
							alt3=1;
						}
						else if ( (LA3_1==INDEX||LA3_1==TABLE) ) {
							alt3=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 3, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case DROP:
						{
						int LA3_2 = input.LA(2);
						if ( (LA3_2==DATABASE) ) {
							alt3=1;
						}
						else if ( (LA3_2==TABLE) ) {
							alt3=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 3, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case DISPLAY:
					case GET:
					case LIST:
					case START:
					case STOP:
						{
						alt3=1;
						}
						break;
					case EOF:
						{
						alt3=1;
						}
						break;
					case ALTER:
					case SET:
						{
						alt3=2;
						}
						break;
					case DELETE:
					case INSERT:
					case SELECT:
					case UPDATE:
						{
						alt3=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}
					switch (alt3) {
						case 1 :
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:69:15: clp_commands
							{
							pushFollow(FOLLOW_clp_commands_in_dml_commands105);
							clp_commands();
							state._fsp--;

							}
							break;
						case 2 :
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:70:4: ddl_commands
							{
							pushFollow(FOLLOW_ddl_commands_in_dml_commands110);
							ddl_commands();
							state._fsp--;

							}
							break;
						case 3 :
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:71:4: dml_commands
							{
							pushFollow(FOLLOW_dml_commands_in_dml_commands115);
							dml_commands();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:73:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "dml_commands"



	// $ANTLR start "select"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:75:1: select : SELECT ( ALL | col_list ) ( NEWLINE )? from ( NEWLINE )* ;
<<<<<<< HEAD
	public final void select() throws  {
=======
	public final void select()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:76:2: ( SELECT ( ALL | col_list ) ( NEWLINE )? from ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:76:4: SELECT ( ALL | col_list ) ( NEWLINE )? from ( NEWLINE )*
			{
			match(input,SELECT,FOLLOW_SELECT_in_select132); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:76:11: ( ALL | col_list )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ALL) ) {
				alt5=1;
			}
			else if ( (LA5_0==AVERAGE||LA5_0==COUNT||LA5_0==FROM||LA5_0==ID||(LA5_0 >= MAX && LA5_0 <= NEWLINE)) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:76:13: ALL
					{
					match(input,ALL,FOLLOW_ALL_in_select136); 
					 programa_stack.peek().select_columns.add("69"); 
					}
					break;
				case 2 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:77:4: col_list
					{
					pushFollow(FOLLOW_col_list_in_select143);
					col_list();
					state._fsp--;

					}
					break;

			}

			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:77:15: ( NEWLINE )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==NEWLINE) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:77:15: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_select147); 
					}
					break;

			}

			pushFollow(FOLLOW_from_in_select150);
			from();
			state._fsp--;

			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:77:29: ( NEWLINE )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==NEWLINE) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:77:29: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_select152); 
					}
					break;

				default :
					break loop7;
				}
			}


					if (!programa_stack.peek().tmp.equals("0") && !programa_stack.peek().tmp.equals("1")) {
						programa_stack.peek().tmp = "-1";
					}
					System.out.println("Select query...");
					System.out.print("Columns: ");
					System.out.println(programa_stack.peek().select_columns);
					System.out.print("Tables: ");
					System.out.println(programa_stack.peek().select_tables);
					System.out.print("Condition: ");
					System.out.println(programa_stack.peek().condition);
					System.out.print("Grouping by: ");
					System.out.println(programa_stack.peek().column);
					System.out.print("XML/JSON: ");
					System.out.println(programa_stack.peek().tmp);
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "select"



	// $ANTLR start "col_list"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:96:1: col_list : ( ( ID | agg_funct ) col_list |);
<<<<<<< HEAD
	public final void col_list() throws  {
=======
	public final void col_list()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		Token ID1=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:97:2: ( ( ID | agg_funct ) col_list |)
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==AVERAGE||LA9_0==COUNT||LA9_0==ID||(LA9_0 >= MAX && LA9_0 <= MIN)) ) {
				alt9=1;
			}
			else if ( (LA9_0==FROM||LA9_0==NEWLINE) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:97:4: ( ID | agg_funct ) col_list
					{
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:97:4: ( ID | agg_funct )
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==ID) ) {
						alt8=1;
					}
					else if ( (LA8_0==AVERAGE||LA8_0==COUNT||(LA8_0 >= MAX && LA8_0 <= MIN)) ) {
						alt8=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}

					switch (alt8) {
						case 1 :
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:97:6: ID
							{
							ID1=(Token)match(input,ID,FOLLOW_ID_in_col_list170); 
							 
								 	programa_stack.peek().select_columns.add("-1"); 
								 	programa_stack.peek().select_columns.add((ID1!=null?ID1.getText():null));
								 
							}
							break;
						case 2 :
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:102:4: agg_funct
							{
							pushFollow(FOLLOW_agg_funct_in_col_list181);
							agg_funct();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_col_list_in_col_list185);
					col_list();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:104:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "col_list"



	// $ANTLR start "from"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:106:1: from : FROM ( ID | join_st ) ( NEWLINE )? ( where )? ( NEWLINE )? ( group )? ( NEWLINE )? ( for_JSON_XML )? ;
<<<<<<< HEAD
	public final void from() throws  {
=======
	public final void from()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		Token ID2=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:107:2: ( FROM ( ID | join_st ) ( NEWLINE )? ( where )? ( NEWLINE )? ( group )? ( NEWLINE )? ( for_JSON_XML )? )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:107:4: FROM ( ID | join_st ) ( NEWLINE )? ( where )? ( NEWLINE )? ( group )? ( NEWLINE )? ( for_JSON_XML )?
			{
			match(input,FROM,FOLLOW_FROM_in_from202); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:107:9: ( ID | join_st )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ID) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==JOIN) ) {
					alt10=2;
				}
				else if ( (LA10_1==EOF||LA10_1==ALTER||LA10_1==CREATE||(LA10_1 >= DELETE && LA10_1 <= DROP)||LA10_1==FOR||LA10_1==GET||LA10_1==GROUP||LA10_1==INSERT||LA10_1==LIST||LA10_1==NEWLINE||(LA10_1 >= SELECT && LA10_1 <= START)||LA10_1==STOP||LA10_1==UPDATE||LA10_1==WHERE) ) {
					alt10=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:107:11: ID
					{
					ID2=(Token)match(input,ID,FOLLOW_ID_in_from206); 
					 programa_stack.peek().select_tables.add((ID2!=null?ID2.getText():null)); 
					}
					break;
				case 2 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:108:4: join_st
					{
					pushFollow(FOLLOW_join_st_in_from213);
					join_st();
					state._fsp--;

					}
					break;

			}

			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:108:14: ( NEWLINE )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==NEWLINE) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:108:14: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_from217); 
					}
					break;

			}

			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:108:23: ( where )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==WHERE) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:108:23: where
					{
					pushFollow(FOLLOW_where_in_from220);
					where();
					state._fsp--;

					}
					break;

			}

			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:108:30: ( NEWLINE )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==NEWLINE) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:108:30: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_from223); 
					}
					break;

			}

			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:108:39: ( group )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==GROUP) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:108:39: group
					{
					pushFollow(FOLLOW_group_in_from226);
					group();
					state._fsp--;

					}
					break;

			}

			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:108:46: ( NEWLINE )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==NEWLINE) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:108:46: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_from229); 
					}
					break;

			}

			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:108:55: ( for_JSON_XML )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==FOR) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:108:55: for_JSON_XML
					{
					pushFollow(FOLLOW_for_JSON_XML_in_from232);
					for_JSON_XML();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "from"



	// $ANTLR start "join_st"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:111:1: join_st : table1= ID JOIN table2= ID join_st_aux ;
<<<<<<< HEAD
	public final void join_st() throws  {
=======
	public final void join_st()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		Token table1=null;
		Token table2=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:112:2: (table1= ID JOIN table2= ID join_st_aux )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:112:4: table1= ID JOIN table2= ID join_st_aux
			{
			table1=(Token)match(input,ID,FOLLOW_ID_in_join_st249); 
			match(input,JOIN,FOLLOW_JOIN_in_join_st251); 
			table2=(Token)match(input,ID,FOLLOW_ID_in_join_st257); 
			pushFollow(FOLLOW_join_st_aux_in_join_st259);
			join_st_aux();
			state._fsp--;


				 	programa_stack.peek().select_tables.add((table1!=null?table1.getText():null));
				 	programa_stack.peek().select_tables.add((table2!=null?table2.getText():null));
				 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "join_st"



	// $ANTLR start "join_st_aux"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:119:1: join_st_aux : ( JOIN ID join_st_aux |);
<<<<<<< HEAD
	public final void join_st_aux() throws  {
=======
	public final void join_st_aux()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		Token ID3=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:120:2: ( JOIN ID join_st_aux |)
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==JOIN) ) {
				alt17=1;
			}
			else if ( (LA17_0==EOF||LA17_0==ALTER||LA17_0==CREATE||(LA17_0 >= DELETE && LA17_0 <= DROP)||LA17_0==FOR||LA17_0==GET||LA17_0==GROUP||LA17_0==INSERT||LA17_0==LIST||LA17_0==NEWLINE||(LA17_0 >= SELECT && LA17_0 <= START)||LA17_0==STOP||LA17_0==UPDATE||LA17_0==WHERE) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:120:4: JOIN ID join_st_aux
					{
					match(input,JOIN,FOLLOW_JOIN_in_join_st_aux275); 
					ID3=(Token)match(input,ID,FOLLOW_ID_in_join_st_aux277); 
					pushFollow(FOLLOW_join_st_aux_in_join_st_aux279);
					join_st_aux();
					state._fsp--;

					 programa_stack.peek().select_tables.add((ID3!=null?ID3.getText():null)); 
					}
					break;
				case 2 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:122:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "join_st_aux"



	// $ANTLR start "where"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:124:1: where : WHERE where_st ;
<<<<<<< HEAD
	public final void where() throws  {
=======
	public final void where()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:125:2: ( WHERE where_st )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:125:4: WHERE where_st
			{
			match(input,WHERE,FOLLOW_WHERE_in_where298); 
			pushFollow(FOLLOW_where_st_in_where300);
			where_st();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "where"



	// $ANTLR start "where_st"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:128:1: where_st : ( ID comp_op value[\"1\"] | ID null_op );
<<<<<<< HEAD
	public final void where_st() throws  {
=======
	public final void where_st()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		Token ID4=null;
		Token ID5=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:129:2: ( ID comp_op value[\"1\"] | ID null_op )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==ID) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==EQUALS||(LA18_1 >= GREATER_EQUALS && LA18_1 <= GREATER_THAN)||(LA18_1 >= LESS_EQUALS && LA18_1 <= LIKE)||LA18_1==NOT) ) {
					alt18=1;
				}
				else if ( (LA18_1==IS) ) {
					alt18=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:129:4: ID comp_op value[\"1\"]
					{
					ID4=(Token)match(input,ID,FOLLOW_ID_in_where_st312); 
					pushFollow(FOLLOW_comp_op_in_where_st314);
					comp_op();
					state._fsp--;

					pushFollow(FOLLOW_value_in_where_st316);
					value("1");
					state._fsp--;

					 programa_stack.peek().condition.add((ID4!=null?ID4.getText():null)); 
					}
					break;
				case 2 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:130:4: ID null_op
					{
					ID5=(Token)match(input,ID,FOLLOW_ID_in_where_st324); 
					pushFollow(FOLLOW_null_op_in_where_st326);
					null_op();
					state._fsp--;

					 programa_stack.peek().condition.add((ID5!=null?ID5.getText():null)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "where_st"



	// $ANTLR start "comp_op"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:133:1: comp_op : ( GREATER_THAN | GREATER_EQUALS | LESS_THAN | LESS_EQUALS | EQUALS | LIKE | NOT );
<<<<<<< HEAD
	public final void comp_op() throws  {
=======
	public final void comp_op()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:134:2: ( GREATER_THAN | GREATER_EQUALS | LESS_THAN | LESS_EQUALS | EQUALS | LIKE | NOT )
			int alt19=7;
			switch ( input.LA(1) ) {
			case GREATER_THAN:
				{
				alt19=1;
				}
				break;
			case GREATER_EQUALS:
				{
				alt19=2;
				}
				break;
			case LESS_THAN:
				{
				alt19=3;
				}
				break;
			case LESS_EQUALS:
				{
				alt19=4;
				}
				break;
			case EQUALS:
				{
				alt19=5;
				}
				break;
			case LIKE:
				{
				alt19=6;
				}
				break;
			case NOT:
				{
				alt19=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:134:4: GREATER_THAN
					{
					match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_comp_op340); 
					 programa_stack.peek().condition.add("2"); 
					}
					break;
				case 2 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:135:4: GREATER_EQUALS
					{
					match(input,GREATER_EQUALS,FOLLOW_GREATER_EQUALS_in_comp_op347); 
					 programa_stack.peek().condition.add("3"); 
					}
					break;
				case 3 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:136:4: LESS_THAN
					{
					match(input,LESS_THAN,FOLLOW_LESS_THAN_in_comp_op354); 
					 programa_stack.peek().condition.add("4"); 
					}
					break;
				case 4 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:137:4: LESS_EQUALS
					{
					match(input,LESS_EQUALS,FOLLOW_LESS_EQUALS_in_comp_op361); 
					 programa_stack.peek().condition.add("5"); 
					}
					break;
				case 5 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:138:4: EQUALS
					{
					match(input,EQUALS,FOLLOW_EQUALS_in_comp_op368); 
					 programa_stack.peek().condition.add("6"); 
					}
					break;
				case 6 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:139:4: LIKE
					{
					match(input,LIKE,FOLLOW_LIKE_in_comp_op375); 
					 programa_stack.peek().condition.add("7"); 
					}
					break;
				case 7 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:140:4: NOT
					{
					match(input,NOT,FOLLOW_NOT_in_comp_op382); 
					 programa_stack.peek().condition.add("8"); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "comp_op"



	// $ANTLR start "null_op"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:143:1: null_op : IS ( NULL | NOT NULL ) ;
<<<<<<< HEAD
	public final void null_op() throws  {
=======
	public final void null_op()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:144:2: ( IS ( NULL | NOT NULL ) )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:144:4: IS ( NULL | NOT NULL )
			{
			match(input,IS,FOLLOW_IS_in_null_op396); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:144:7: ( NULL | NOT NULL )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==NULL) ) {
				alt20=1;
			}
			else if ( (LA20_0==NOT) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:144:9: NULL
					{
					match(input,NULL,FOLLOW_NULL_in_null_op400); 
					 
						 	programa_stack.peek().condition.add("1");
						 	programa_stack.peek().condition.add("-1");
						 
					}
					break;
				case 2 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:149:4: NOT NULL
					{
					match(input,NOT,FOLLOW_NOT_in_null_op411); 
					match(input,NULL,FOLLOW_NULL_in_null_op413); 
					 
						 	programa_stack.peek().condition.add("0");
						 	programa_stack.peek().condition.add("-1");
						 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "null_op"



	// $ANTLR start "group"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:156:1: group : GROUP BY cols ;
<<<<<<< HEAD
	public final void group() throws  {
=======
	public final void group()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:157:2: ( GROUP BY cols )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:157:4: GROUP BY cols
			{
			match(input,GROUP,FOLLOW_GROUP_in_group433); 
			match(input,BY,FOLLOW_BY_in_group435); 
			pushFollow(FOLLOW_cols_in_group437);
			cols();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "group"



	// $ANTLR start "cols"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:160:1: cols : ( ID cols |);
<<<<<<< HEAD
	public final void cols() throws  {
=======
	public final void cols()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		Token ID6=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:161:2: ( ID cols |)
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==ID) ) {
				alt21=1;
			}
			else if ( (LA21_0==EOF||LA21_0==ALTER||LA21_0==CREATE||(LA21_0 >= DELETE && LA21_0 <= DROP)||LA21_0==FOR||LA21_0==GET||LA21_0==INSERT||LA21_0==LIST||LA21_0==NEWLINE||(LA21_0 >= RIGHT_PAR && LA21_0 <= START)||LA21_0==STOP||LA21_0==UPDATE) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:161:4: ID cols
					{
					ID6=(Token)match(input,ID,FOLLOW_ID_in_cols449); 
					pushFollow(FOLLOW_cols_in_cols451);
					cols();
					state._fsp--;

					 programa_stack.peek().column.add((ID6!=null?ID6.getText():null)); 
					}
					break;
				case 2 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:163:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cols"



	// $ANTLR start "for_JSON_XML"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:165:1: for_JSON_XML : FOR ( JSON | XML ) ;
<<<<<<< HEAD
	public final void for_JSON_XML() throws  {
=======
	public final void for_JSON_XML()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:166:2: ( FOR ( JSON | XML ) )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:166:4: FOR ( JSON | XML )
			{
			match(input,FOR,FOLLOW_FOR_in_for_JSON_XML468); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:166:8: ( JSON | XML )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==JSON) ) {
				alt22=1;
			}
			else if ( (LA22_0==XML) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:166:10: JSON
					{
					match(input,JSON,FOLLOW_JSON_in_for_JSON_XML472); 
					 programa_stack.peek().tmp = "0"; 
					}
					break;
				case 2 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:167:4: XML
					{
					match(input,XML,FOLLOW_XML_in_for_JSON_XML479); 
					 programa_stack.peek().tmp = "1"; 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "for_JSON_XML"



	// $ANTLR start "agg_funct"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:170:1: agg_funct : ( COUNT | AVERAGE | MIN | MAX ) LEFT_PAR ID RIGHT_PAR ;
<<<<<<< HEAD
	public final void agg_funct() throws  {
=======
	public final void agg_funct()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		Token ID7=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:171:2: ( ( COUNT | AVERAGE | MIN | MAX ) LEFT_PAR ID RIGHT_PAR )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:171:4: ( COUNT | AVERAGE | MIN | MAX ) LEFT_PAR ID RIGHT_PAR
			{
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:171:4: ( COUNT | AVERAGE | MIN | MAX )
			int alt23=4;
			switch ( input.LA(1) ) {
			case COUNT:
				{
				alt23=1;
				}
				break;
			case AVERAGE:
				{
				alt23=2;
				}
				break;
			case MIN:
				{
				alt23=3;
				}
				break;
			case MAX:
				{
				alt23=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:171:6: COUNT
					{
					match(input,COUNT,FOLLOW_COUNT_in_agg_funct497); 
					 programa_stack.peek().select_columns.add("0");  
					}
					break;
				case 2 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:172:4: AVERAGE
					{
					match(input,AVERAGE,FOLLOW_AVERAGE_in_agg_funct504); 
					 programa_stack.peek().select_columns.add("1");  
					}
					break;
				case 3 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:173:4: MIN
					{
					match(input,MIN,FOLLOW_MIN_in_agg_funct511); 
					 programa_stack.peek().select_columns.add("2");  
					}
					break;
				case 4 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:174:4: MAX
					{
					match(input,MAX,FOLLOW_MAX_in_agg_funct518); 
					 programa_stack.peek().select_columns.add("3");  
					}
					break;

			}

			match(input,LEFT_PAR,FOLLOW_LEFT_PAR_in_agg_funct526); 
			ID7=(Token)match(input,ID,FOLLOW_ID_in_agg_funct528); 
			 programa_stack.peek().select_columns.add((ID7!=null?ID7.getText():null));  
			match(input,RIGHT_PAR,FOLLOW_RIGHT_PAR_in_agg_funct532); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "agg_funct"



	// $ANTLR start "update"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:178:1: update : UPDATE table= ID ( NEWLINE )? SET column= ID EQUALS value[\"2\"] ( NEWLINE )? where ( NEWLINE )* ;
<<<<<<< HEAD
	public final void update() throws  {
=======
	public final void update()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		Token table=null;
		Token column=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:179:2: ( UPDATE table= ID ( NEWLINE )? SET column= ID EQUALS value[\"2\"] ( NEWLINE )? where ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:179:4: UPDATE table= ID ( NEWLINE )? SET column= ID EQUALS value[\"2\"] ( NEWLINE )? where ( NEWLINE )*
			{
			match(input,UPDATE,FOLLOW_UPDATE_in_update544); 
			table=(Token)match(input,ID,FOLLOW_ID_in_update550); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:179:22: ( NEWLINE )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==NEWLINE) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:179:22: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_update552); 
					}
					break;

			}

			match(input,SET,FOLLOW_SET_in_update555); 
			column=(Token)match(input,ID,FOLLOW_ID_in_update561); 
			match(input,EQUALS,FOLLOW_EQUALS_in_update563); 
			pushFollow(FOLLOW_value_in_update565);
			value("2");
			state._fsp--;

			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:179:65: ( NEWLINE )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==NEWLINE) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:179:65: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_update568); 
					}
					break;

			}

			pushFollow(FOLLOW_where_in_update571);
			where();
			state._fsp--;

			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:179:80: ( NEWLINE )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==NEWLINE) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:179:80: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_update573); 
					}
					break;

				default :
					break loop26;
				}
			}


				 	System.out.println("Updating column " + (column!=null?column.getText():null) + " from table " + (table!=null?table.getText():null) + "...");
				 	System.out.println("New value: " + programa_stack.peek().tmp);
				 	System.out.println("Condition:");
				 	System.out.println(programa_stack.peek().condition);
				 	programa_stack.peek().condition.clear();
				 	programa_stack.peek().values.clear();
				 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "update"



	// $ANTLR start "delete"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:190:1: delete : DELETE ( NEWLINE )? FROM ID ( NEWLINE )? where ( NEWLINE )* ;
<<<<<<< HEAD
	public final void delete() throws  {
=======
	public final void delete()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		Token ID8=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:191:2: ( DELETE ( NEWLINE )? FROM ID ( NEWLINE )? where ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:191:4: DELETE ( NEWLINE )? FROM ID ( NEWLINE )? where ( NEWLINE )*
			{
			match(input,DELETE,FOLLOW_DELETE_in_delete590); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:191:11: ( NEWLINE )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==NEWLINE) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:191:11: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_delete592); 
					}
					break;

			}

			match(input,FROM,FOLLOW_FROM_in_delete595); 
			ID8=(Token)match(input,ID,FOLLOW_ID_in_delete597); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:191:28: ( NEWLINE )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==NEWLINE) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:191:28: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_delete599); 
					}
					break;

			}

			pushFollow(FOLLOW_where_in_delete602);
			where();
			state._fsp--;

			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:191:43: ( NEWLINE )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==NEWLINE) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:191:43: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_delete604); 
					}
					break;

				default :
					break loop29;
				}
			}


				 	System.out.println("Delete from table " + (ID8!=null?ID8.getText():null));
				 	System.out.print("Condition: ");
				 	System.out.println(programa_stack.peek().condition);
				 	programa_stack.peek().condition.clear();
				 	programa_stack.peek().values.clear();
				 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "delete"



	// $ANTLR start "insert"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:201:1: insert : INSERT INTO ID LEFT_PAR cols RIGHT_PAR ( NEWLINE )? VALUES LEFT_PAR values RIGHT_PAR ( NEWLINE )* ;
<<<<<<< HEAD
	public final void insert() throws  {
=======
	public final void insert()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		Token ID9=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:202:2: ( INSERT INTO ID LEFT_PAR cols RIGHT_PAR ( NEWLINE )? VALUES LEFT_PAR values RIGHT_PAR ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:202:4: INSERT INTO ID LEFT_PAR cols RIGHT_PAR ( NEWLINE )? VALUES LEFT_PAR values RIGHT_PAR ( NEWLINE )*
			{
			match(input,INSERT,FOLLOW_INSERT_in_insert621); 
			match(input,INTO,FOLLOW_INTO_in_insert623); 
			ID9=(Token)match(input,ID,FOLLOW_ID_in_insert625); 
			match(input,LEFT_PAR,FOLLOW_LEFT_PAR_in_insert627); 
			pushFollow(FOLLOW_cols_in_insert629);
			cols();
			state._fsp--;

			match(input,RIGHT_PAR,FOLLOW_RIGHT_PAR_in_insert631); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:202:43: ( NEWLINE )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==NEWLINE) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:202:43: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_insert633); 
					}
					break;

			}

			match(input,VALUES,FOLLOW_VALUES_in_insert636); 
			match(input,LEFT_PAR,FOLLOW_LEFT_PAR_in_insert638); 
			pushFollow(FOLLOW_values_in_insert640);
			values();
			state._fsp--;

			match(input,RIGHT_PAR,FOLLOW_RIGHT_PAR_in_insert642); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:202:85: ( NEWLINE )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==NEWLINE) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:202:85: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_insert644); 
					}
					break;

				default :
					break loop31;
				}
			}


				 	System.out.println("Insert into table " + (ID9!=null?ID9.getText():null));
				 	if (programa_stack.peek().column.size() != programa_stack.peek().values.size()) {
				 		System.out.println("Error: Mismatch between columns and values");
				 	} else {
				 		System.out.print("Columns: ");
				 		System.out.println(programa_stack.peek().column);
				 		System.out.print("Values: ");
				 		System.out.println(programa_stack.peek().values);
				 	}
				 	programa_stack.peek().column.clear();
				 	programa_stack.peek().values.clear();
				 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "insert"



	// $ANTLR start "values"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:218:1: values : ( value[\"0\"] values |);
<<<<<<< HEAD
	public final void values() throws  {
=======
	public final void values()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:219:2: ( value[\"0\"] values |)
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==FLOAT||LA32_0==ID||LA32_0==INT) ) {
				alt32=1;
			}
			else if ( (LA32_0==RIGHT_PAR) ) {
				alt32=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:219:4: value[\"0\"] values
					{
					pushFollow(FOLLOW_value_in_values661);
					value("0");
					state._fsp--;

					pushFollow(FOLLOW_values_in_values664);
					values();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:221:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "values"



	// $ANTLR start "value"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:223:1: value[String sel] : ( INT | FLOAT | ID );
<<<<<<< HEAD
	public final void value(String sel) throws  {
=======
	public final void value(String sel)   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		Token INT10=null;
		Token FLOAT11=null;
		Token ID12=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:224:2: ( INT | FLOAT | ID )
			int alt33=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt33=1;
				}
				break;
			case FLOAT:
				{
				alt33=2;
				}
				break;
			case ID:
				{
				alt33=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:224:4: INT
					{
					INT10=(Token)match(input,INT,FOLLOW_INT_in_value681); 
					 
						 	if (sel.equals("0")) { programa_stack.peek().values.add((INT10!=null?INT10.getText():null)); }
						 	else if (sel.equals("1")) { programa_stack.peek().condition.add((INT10!=null?INT10.getText():null)); }
						 	else { programa_stack.peek().tmp = (INT10!=null?INT10.getText():null); }
						 
					}
					break;
				case 2 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:230:4: FLOAT
					{
					FLOAT11=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_value691); 
					 
						 	if (sel.equals("0")) { programa_stack.peek().values.add((FLOAT11!=null?FLOAT11.getText():null)); }
						 	else if (sel.equals("1")) { programa_stack.peek().condition.add((FLOAT11!=null?FLOAT11.getText():null)); }
						 	else { programa_stack.peek().tmp = (FLOAT11!=null?FLOAT11.getText():null); }
						 
					}
					break;
				case 3 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:236:4: ID
					{
					ID12=(Token)match(input,ID,FOLLOW_ID_in_value701); 
					 
						 	if (sel.equals("0")) { programa_stack.peek().values.add((ID12!=null?ID12.getText():null)); }
						 	else if (sel.equals("1")) { programa_stack.peek().condition.add((ID12!=null?ID12.getText():null)); }
						 	else { programa_stack.peek().tmp = (ID12!=null?ID12.getText():null); }
						 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "value"



	// $ANTLR start "ddl_commands"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:245:1: ddl_commands : ( ( set_db | create_index | drop_table | alter_table | create_table ) ( ddl_commands | dml_commands | clp_commands ) |);
<<<<<<< HEAD
	public final void ddl_commands() throws  {
=======
	public final void ddl_commands()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:246:2: ( ( set_db | create_index | drop_table | alter_table | create_table ) ( ddl_commands | dml_commands | clp_commands ) |)
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==ALTER||LA36_0==CREATE||LA36_0==DROP||LA36_0==SET) ) {
				alt36=1;
			}
			else if ( (LA36_0==EOF) ) {
				alt36=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:246:4: ( set_db | create_index | drop_table | alter_table | create_table ) ( ddl_commands | dml_commands | clp_commands )
					{
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:246:4: ( set_db | create_index | drop_table | alter_table | create_table )
					int alt34=5;
					switch ( input.LA(1) ) {
					case SET:
						{
						alt34=1;
						}
						break;
					case CREATE:
						{
						int LA34_2 = input.LA(2);
						if ( (LA34_2==INDEX) ) {
							alt34=2;
						}
						else if ( (LA34_2==TABLE) ) {
							alt34=5;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 34, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case DROP:
						{
						alt34=3;
						}
						break;
					case ALTER:
						{
						alt34=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 34, 0, input);
						throw nvae;
					}
					switch (alt34) {
						case 1 :
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:246:6: set_db
							{
							pushFollow(FOLLOW_set_db_in_ddl_commands723);
							set_db();
							state._fsp--;

							}
							break;
						case 2 :
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:247:4: create_index
							{
							pushFollow(FOLLOW_create_index_in_ddl_commands728);
							create_index();
							state._fsp--;

							}
							break;
						case 3 :
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:248:4: drop_table
							{
							pushFollow(FOLLOW_drop_table_in_ddl_commands733);
							drop_table();
							state._fsp--;

							}
							break;
						case 4 :
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:249:4: alter_table
							{
							pushFollow(FOLLOW_alter_table_in_ddl_commands738);
							alter_table();
							state._fsp--;

							}
							break;
						case 5 :
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:250:4: create_table
							{
							pushFollow(FOLLOW_create_table_in_ddl_commands743);
							create_table();
							state._fsp--;

							}
							break;

					}

					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:250:19: ( ddl_commands | dml_commands | clp_commands )
					int alt35=3;
					switch ( input.LA(1) ) {
					case ALTER:
					case SET:
						{
						alt35=1;
						}
						break;
					case CREATE:
						{
						int LA35_2 = input.LA(2);
						if ( (LA35_2==INDEX||LA35_2==TABLE) ) {
							alt35=1;
						}
						else if ( (LA35_2==DATABASE) ) {
							alt35=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 35, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case DROP:
						{
						int LA35_3 = input.LA(2);
						if ( (LA35_3==TABLE) ) {
							alt35=1;
						}
						else if ( (LA35_3==DATABASE) ) {
							alt35=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 35, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case EOF:
						{
						alt35=1;
						}
						break;
					case DELETE:
					case INSERT:
					case SELECT:
					case UPDATE:
						{
						alt35=2;
						}
						break;
					case DISPLAY:
					case GET:
					case LIST:
					case START:
					case STOP:
						{
						alt35=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 35, 0, input);
						throw nvae;
					}
					switch (alt35) {
						case 1 :
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:250:21: ddl_commands
							{
							pushFollow(FOLLOW_ddl_commands_in_ddl_commands749);
							ddl_commands();
							state._fsp--;

							}
							break;
						case 2 :
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:251:4: dml_commands
							{
							pushFollow(FOLLOW_dml_commands_in_ddl_commands754);
							dml_commands();
							state._fsp--;

							}
							break;
						case 3 :
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:252:4: clp_commands
							{
							pushFollow(FOLLOW_clp_commands_in_ddl_commands759);
							clp_commands();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:254:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ddl_commands"



	// $ANTLR start "set_db"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:257:1: set_db : SET DATABASE ID ( NEWLINE )* ;
<<<<<<< HEAD
	public final void set_db() throws  {
=======
	public final void set_db()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		Token ID13=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:258:2: ( SET DATABASE ID ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:258:4: SET DATABASE ID ( NEWLINE )*
			{
			match(input,SET,FOLLOW_SET_in_set_db781); 
			match(input,DATABASE,FOLLOW_DATABASE_in_set_db783); 
			ID13=(Token)match(input,ID,FOLLOW_ID_in_set_db785); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:258:20: ( NEWLINE )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==NEWLINE) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:258:20: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_set_db787); 
					}
					break;

				default :
					break loop37;
				}
			}

			System.out.println("Setting " + (ID13!=null?ID13.getText():null) + " as current database...");

				 	// Fijar el esquema actual
				 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "set_db"



	// $ANTLR start "create_index"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:265:1: create_index : CREATE INDEX index= ID ON ( NEWLINE )? table= ID LEFT_PAR column= ID RIGHT_PAR ( NEWLINE )* ;
<<<<<<< HEAD
	public final void create_index() throws  {
=======
	public final void create_index()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		Token index=null;
		Token table=null;
		Token column=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:266:2: ( CREATE INDEX index= ID ON ( NEWLINE )? table= ID LEFT_PAR column= ID RIGHT_PAR ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:266:4: CREATE INDEX index= ID ON ( NEWLINE )? table= ID LEFT_PAR column= ID RIGHT_PAR ( NEWLINE )*
			{
			match(input,CREATE,FOLLOW_CREATE_in_create_index808); 
			match(input,INDEX,FOLLOW_INDEX_in_create_index810); 
			index=(Token)match(input,ID,FOLLOW_ID_in_create_index816); 
			match(input,ON,FOLLOW_ON_in_create_index818); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:266:31: ( NEWLINE )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==NEWLINE) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:266:31: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_create_index820); 
					}
					break;

			}

			table=(Token)match(input,ID,FOLLOW_ID_in_create_index827); 
			match(input,LEFT_PAR,FOLLOW_LEFT_PAR_in_create_index829); 
			column=(Token)match(input,ID,FOLLOW_ID_in_create_index835); 
			match(input,RIGHT_PAR,FOLLOW_RIGHT_PAR_in_create_index837); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:266:82: ( NEWLINE )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==NEWLINE) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:266:82: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_create_index839); 
					}
					break;

				default :
					break loop39;
				}
			}


				 	System.out.println("Creating index " + (index!=null?index.getText():null) + " on column " + (column!=null?column.getText():null) + " from table " + (table!=null?table.getText():null) 
				 	+ "...");
				 	
				 	// Crear índice
				 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "create_index"



	// $ANTLR start "drop_table"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:276:1: drop_table : DROP TABLE ID ( NEWLINE )* ;
<<<<<<< HEAD
	public final void drop_table() throws  {
=======
	public final void drop_table()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		Token ID14=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:277:2: ( DROP TABLE ID ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:277:4: DROP TABLE ID ( NEWLINE )*
			{
			match(input,DROP,FOLLOW_DROP_in_drop_table859); 
			match(input,TABLE,FOLLOW_TABLE_in_drop_table861); 
			ID14=(Token)match(input,ID,FOLLOW_ID_in_drop_table863); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:277:18: ( NEWLINE )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==NEWLINE) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:277:18: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_drop_table865); 
					}
					break;

				default :
					break loop40;
				}
			}

			System.out.println("Deleting table " + (ID14!=null?ID14.getText():null) + "...");

				 	// Eliminar tabla
				 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "drop_table"



	// $ANTLR start "alter_table"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:284:1: alter_table : ALTER TABLE ID ( NEWLINE )? ADD CONSTRAINT const_def[$ID.text] ( NEWLINE )* ;
<<<<<<< HEAD
	public final void alter_table() throws  {
=======
	public final void alter_table()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		Token ID15=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:285:2: ( ALTER TABLE ID ( NEWLINE )? ADD CONSTRAINT const_def[$ID.text] ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:285:4: ALTER TABLE ID ( NEWLINE )? ADD CONSTRAINT const_def[$ID.text] ( NEWLINE )*
			{
			match(input,ALTER,FOLLOW_ALTER_in_alter_table887); 
			match(input,TABLE,FOLLOW_TABLE_in_alter_table889); 
			ID15=(Token)match(input,ID,FOLLOW_ID_in_alter_table891); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:285:19: ( NEWLINE )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==NEWLINE) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:285:19: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_alter_table893); 
					}
					break;

			}

			match(input,ADD,FOLLOW_ADD_in_alter_table896); 
			match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_alter_table898); 
			pushFollow(FOLLOW_const_def_in_alter_table900);
			const_def((ID15!=null?ID15.getText():null));
			state._fsp--;

			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:285:63: ( NEWLINE )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==NEWLINE) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:285:63: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_alter_table903); 
					}
					break;

				default :
					break loop42;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "alter_table"



	// $ANTLR start "const_def"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:288:1: const_def[String table] : FOREIGN KEY LEFT_PAR column= ID RIGHT_PAR ( NEWLINE )? REFERENCES r_table= ID LEFT_PAR r_column= ID RIGHT_PAR ;
<<<<<<< HEAD
	public final void const_def(String table) throws  {
=======
	public final void const_def(String table)   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		Token column=null;
		Token r_table=null;
		Token r_column=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:289:2: ( FOREIGN KEY LEFT_PAR column= ID RIGHT_PAR ( NEWLINE )? REFERENCES r_table= ID LEFT_PAR r_column= ID RIGHT_PAR )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:289:4: FOREIGN KEY LEFT_PAR column= ID RIGHT_PAR ( NEWLINE )? REFERENCES r_table= ID LEFT_PAR r_column= ID RIGHT_PAR
			{
			match(input,FOREIGN,FOLLOW_FOREIGN_in_const_def918); 
			match(input,KEY,FOLLOW_KEY_in_const_def920); 
			match(input,LEFT_PAR,FOLLOW_LEFT_PAR_in_const_def922); 
			column=(Token)match(input,ID,FOLLOW_ID_in_const_def928); 
			match(input,RIGHT_PAR,FOLLOW_RIGHT_PAR_in_const_def930); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:289:47: ( NEWLINE )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==NEWLINE) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:289:47: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_const_def932); 
					}
					break;

			}

			match(input,REFERENCES,FOLLOW_REFERENCES_in_const_def935); 
			r_table=(Token)match(input,ID,FOLLOW_ID_in_const_def941); 
			match(input,LEFT_PAR,FOLLOW_LEFT_PAR_in_const_def943); 
			r_column=(Token)match(input,ID,FOLLOW_ID_in_const_def949); 
			match(input,RIGHT_PAR,FOLLOW_RIGHT_PAR_in_const_def951); 

				 	System.out.println("Column " + (column!=null?column.getText():null) + " from table " + table + " references column " +
				 	(r_column!=null?r_column.getText():null) + " from table " + (r_table!=null?r_table.getText():null));
				 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "const_def"



	// $ANTLR start "create_table"
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:297:1: create_table : CREATE TABLE ID AS LEFT_PAR ( NEWLINE )? col_def p_key RIGHT_PAR ( NEWLINE )* ;
<<<<<<< HEAD
	public final void create_table() throws  {
=======
	public final void create_table()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		Token ID16=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:298:2: ( CREATE TABLE ID AS LEFT_PAR ( NEWLINE )? col_def p_key RIGHT_PAR ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:298:4: CREATE TABLE ID AS LEFT_PAR ( NEWLINE )? col_def p_key RIGHT_PAR ( NEWLINE )*
			{
			match(input,CREATE,FOLLOW_CREATE_in_create_table970); 
			match(input,TABLE,FOLLOW_TABLE_in_create_table972); 
			ID16=(Token)match(input,ID,FOLLOW_ID_in_create_table974); 
			match(input,AS,FOLLOW_AS_in_create_table976); 
			match(input,LEFT_PAR,FOLLOW_LEFT_PAR_in_create_table978); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:298:32: ( NEWLINE )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==NEWLINE) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:298:32: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_create_table980); 
					}
					break;

			}

			pushFollow(FOLLOW_col_def_in_create_table983);
			col_def();
			state._fsp--;

			pushFollow(FOLLOW_p_key_in_create_table985);
			p_key();
			state._fsp--;

			match(input,RIGHT_PAR,FOLLOW_RIGHT_PAR_in_create_table987); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:298:65: ( NEWLINE )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==NEWLINE) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:298:65: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_create_table989); 
					}
					break;

				default :
					break loop45;
				}
			}


				 	Collections.reverse(programa_stack.peek().column);
				 	int j = 0;
<<<<<<< HEAD
				 	for (int k = 0; k < programa_stack.peek().type_null.size(); k += 4) {
=======
				 	for(int k = 0; k < programa_stack.peek().type_null.size(); k += 4) {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
				 		Vector<String> v = new Vector<String>();
				 		v.add(programa_stack.peek().column.get(j));
				 		v.add(programa_stack.peek().type_null.get(k));
				 		v.add(programa_stack.peek().type_null.get(k + 1));
				 		v.add(programa_stack.peek().type_null.get(k + 2));
				 		v.add(programa_stack.peek().type_null.get(k + 3));
				 		programa_stack.peek().columns.add(v);
				 		j++;
				 	}
<<<<<<< HEAD
					boolean pk = false;
					boolean pk_exists = false;
					for (int i = 0; i < programa_stack.peek().columns.size(); i++) {
						Vector<String> v = programa_stack.peek().columns.get(i);
						if (v.get(0).equals(programa_stack.peek().tmp)) {
							pk_exists = true;
							if (v.get(4).equals("1")) {
								pk = true;
							}
						}
					}
					if (!pk_exists) {
						System.out.println("Error: Primary key is not a valid column");
					} else if (pk) {
						System.out.println("Error: Primary key can't be null");
					} else {
				 		System.out.println("Table: " + (ID16!=null?ID16.getText():null));
				 		System.out.println("Columns:");
				 		for(int i = 0; i < programa_stack.peek().columns.size(); i++) {
				 			System.out.println(programa_stack.peek().columns.get(i));
				 		}
				 		System.out.println("Primary key: " + programa_stack.peek().tmp);
				 	}
=======
				 	System.out.println("Table: " + (ID16!=null?ID16.getText():null));
				 	System.out.println("Columns:");
				 	for(int i = 0; i < programa_stack.peek().columns.size(); i++) {
				 		System.out.println(programa_stack.peek().columns.get(i));
				 	}
				 	System.out.println("Primary key: " + programa_stack.peek().tmp);
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
				 	programa_stack.peek().column.clear();
				 	programa_stack.peek().type_null.clear();
				 	programa_stack.peek().columns.clear();
				 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "create_table"



	// $ANTLR start "col_def"
<<<<<<< HEAD
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:342:1: col_def : ( ID type null_cons ( NEWLINE )? col_def |);
	public final void col_def() throws  {
		Token ID17=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:343:2: ( ID type null_cons ( NEWLINE )? col_def |)
=======
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:325:1: col_def : ( ID type null_cons ( NEWLINE )? col_def |);
	public final void col_def()   {
		Token ID17=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:326:2: ( ID type null_cons ( NEWLINE )? col_def |)
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==ID) ) {
				alt47=1;
			}
			else if ( (LA47_0==PRIMARY) ) {
				alt47=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}

			switch (alt47) {
				case 1 :
<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:343:4: ID type null_cons ( NEWLINE )? col_def
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:326:4: ID type null_cons ( NEWLINE )? col_def
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					{
					ID17=(Token)match(input,ID,FOLLOW_ID_in_col_def1009); 
					pushFollow(FOLLOW_type_in_col_def1011);
					type();
					state._fsp--;

					pushFollow(FOLLOW_null_cons_in_col_def1013);
					null_cons();
					state._fsp--;

<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:343:22: ( NEWLINE )?
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:326:22: ( NEWLINE )?
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==NEWLINE) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
<<<<<<< HEAD
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:343:22: NEWLINE
=======
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:326:22: NEWLINE
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
							{
							match(input,NEWLINE,FOLLOW_NEWLINE_in_col_def1015); 
							}
							break;

					}

					pushFollow(FOLLOW_col_def_in_col_def1018);
					col_def();
					state._fsp--;


						 	//programa_stack.peek().columns.add(programa_stack.peek().column);
						 	//programa_stack.peek().column.clear();
						 	//programa_stack.peek().column.add((ID17!=null?ID17.getText():null));
						 	//System.out.println((ID17!=null?ID17.getText():null));
						 	programa_stack.peek().column.add((ID17!=null?ID17.getText():null));
						 
					}
					break;
				case 2 :
<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:352:2: 
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:335:2: 
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "col_def"



	// $ANTLR start "type"
<<<<<<< HEAD
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:355:1: type : ( INTEGER | DECIMAL LEFT_PAR digits= INT COLON decimals= INT RIGHT_PAR | CHARACTER LEFT_PAR INT RIGHT_PAR | VARCHAR | DATETIME );
	public final void type() throws  {
=======
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:338:1: type : ( INTEGER | DECIMAL LEFT_PAR digits= INT COLON decimals= INT RIGHT_PAR | CHARACTER LEFT_PAR INT RIGHT_PAR | VARCHAR | DATETIME );
	public final void type()   {
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
		Token digits=null;
		Token decimals=null;
		Token INTEGER18=null;
		Token DECIMAL19=null;
		Token INT20=null;
		Token CHARACTER21=null;
		Token VARCHAR22=null;
		Token DATETIME23=null;

		try {
<<<<<<< HEAD
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:356:2: ( INTEGER | DECIMAL LEFT_PAR digits= INT COLON decimals= INT RIGHT_PAR | CHARACTER LEFT_PAR INT RIGHT_PAR | VARCHAR | DATETIME )
=======
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:339:2: ( INTEGER | DECIMAL LEFT_PAR digits= INT COLON decimals= INT RIGHT_PAR | CHARACTER LEFT_PAR INT RIGHT_PAR | VARCHAR | DATETIME )
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
			int alt48=5;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt48=1;
				}
				break;
			case DECIMAL:
				{
				alt48=2;
				}
				break;
			case CHARACTER:
				{
				alt48=3;
				}
				break;
			case VARCHAR:
				{
				alt48=4;
				}
				break;
			case DATETIME:
				{
				alt48=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:356:4: INTEGER
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:339:4: INTEGER
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					{
					INTEGER18=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type1042); 
					 
						 	programa_stack.peek().type_null.add("0");
						 	programa_stack.peek().type_null.add("-1");
						 	programa_stack.peek().type_null.add("-1");
						 	//System.out.println((INTEGER18!=null?INTEGER18.getText():null));
						 
					}
					break;
				case 2 :
<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:363:4: DECIMAL LEFT_PAR digits= INT COLON decimals= INT RIGHT_PAR
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:346:4: DECIMAL LEFT_PAR digits= INT COLON decimals= INT RIGHT_PAR
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					{
					DECIMAL19=(Token)match(input,DECIMAL,FOLLOW_DECIMAL_in_type1052); 
					match(input,LEFT_PAR,FOLLOW_LEFT_PAR_in_type1054); 
					digits=(Token)match(input,INT,FOLLOW_INT_in_type1060); 
					match(input,COLON,FOLLOW_COLON_in_type1062); 
					decimals=(Token)match(input,INT,FOLLOW_INT_in_type1068); 
					match(input,RIGHT_PAR,FOLLOW_RIGHT_PAR_in_type1070); 
					 
						 	programa_stack.peek().type_null.add("1");
						 	programa_stack.peek().type_null.add((digits!=null?digits.getText():null));
						 	programa_stack.peek().type_null.add((decimals!=null?decimals.getText():null));
						 	//System.out.println((DECIMAL19!=null?DECIMAL19.getText():null));
						 
					}
					break;
				case 3 :
<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:370:4: CHARACTER LEFT_PAR INT RIGHT_PAR
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:353:4: CHARACTER LEFT_PAR INT RIGHT_PAR
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					{
					CHARACTER21=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_type1080); 
					match(input,LEFT_PAR,FOLLOW_LEFT_PAR_in_type1082); 
					INT20=(Token)match(input,INT,FOLLOW_INT_in_type1084); 
					match(input,RIGHT_PAR,FOLLOW_RIGHT_PAR_in_type1086); 
					 
						 	programa_stack.peek().type_null.add("2");
						 	programa_stack.peek().type_null.add((INT20!=null?INT20.getText():null));
						 	programa_stack.peek().type_null.add("-1");
						 	//System.out.println((CHARACTER21!=null?CHARACTER21.getText():null));
						 
					}
					break;
				case 4 :
<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:377:4: VARCHAR
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:360:4: VARCHAR
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					{
					VARCHAR22=(Token)match(input,VARCHAR,FOLLOW_VARCHAR_in_type1096); 
					 
						 	programa_stack.peek().type_null.add("3");
						 	programa_stack.peek().type_null.add("-1");
						 	programa_stack.peek().type_null.add("-1");
						 	//System.out.println((VARCHAR22!=null?VARCHAR22.getText():null));
						 
					}
					break;
				case 5 :
<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:384:4: DATETIME
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:367:4: DATETIME
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					{
					DATETIME23=(Token)match(input,DATETIME,FOLLOW_DATETIME_in_type1106); 
					 
						 	programa_stack.peek().type_null.add("4"); 
						 	programa_stack.peek().type_null.add("-1");
						 	programa_stack.peek().type_null.add("-1");
						 	//System.out.println((DATETIME23!=null?DATETIME23.getText():null));
						 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"



	// $ANTLR start "null_cons"
<<<<<<< HEAD
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:394:1: null_cons : ( NULL | NOT NULL );
	public final void null_cons() throws  {
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:395:2: ( NULL | NOT NULL )
=======
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:377:1: null_cons : ( NULL | NOT NULL );
	public final void null_cons()   {
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:378:2: ( NULL | NOT NULL )
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==NULL) ) {
				alt49=1;
			}
			else if ( (LA49_0==NOT) ) {
				alt49=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:395:4: NULL
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:378:4: NULL
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					{
					match(input,NULL,FOLLOW_NULL_in_null_cons1126); 
					 
						 	programa_stack.peek().type_null.add("1");
						 	//System.out.println("NULL");
						 
					}
					break;
				case 2 :
<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:400:4: NOT NULL
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:383:4: NOT NULL
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					{
					match(input,NOT,FOLLOW_NOT_in_null_cons1136); 
					match(input,NULL,FOLLOW_NULL_in_null_cons1138); 
					 
						 	programa_stack.peek().type_null.add("0");
						 	//System.out.println("NOT NULL");
						 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "null_cons"



	// $ANTLR start "p_key"
<<<<<<< HEAD
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:408:1: p_key : PRIMARY KEY LEFT_PAR ID RIGHT_PAR ( NEWLINE )? ;
	public final void p_key() throws  {
		Token ID24=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:409:2: ( PRIMARY KEY LEFT_PAR ID RIGHT_PAR ( NEWLINE )? )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:409:4: PRIMARY KEY LEFT_PAR ID RIGHT_PAR ( NEWLINE )?
=======
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:391:1: p_key : PRIMARY KEY LEFT_PAR ID RIGHT_PAR ( NEWLINE )? ;
	public final void p_key()   {
		Token ID24=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:392:2: ( PRIMARY KEY LEFT_PAR ID RIGHT_PAR ( NEWLINE )? )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:392:4: PRIMARY KEY LEFT_PAR ID RIGHT_PAR ( NEWLINE )?
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
			{
			match(input,PRIMARY,FOLLOW_PRIMARY_in_p_key1158); 
			match(input,KEY,FOLLOW_KEY_in_p_key1160); 
			match(input,LEFT_PAR,FOLLOW_LEFT_PAR_in_p_key1162); 
			ID24=(Token)match(input,ID,FOLLOW_ID_in_p_key1164); 
			match(input,RIGHT_PAR,FOLLOW_RIGHT_PAR_in_p_key1166); 
<<<<<<< HEAD
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:409:38: ( NEWLINE )?
=======
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:392:38: ( NEWLINE )?
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==NEWLINE) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:409:38: NEWLINE
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:392:38: NEWLINE
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_p_key1168); 
					}
					break;

			}


				 	programa_stack.peek().tmp = (ID24!=null?ID24.getText():null);
				 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "p_key"



	// $ANTLR start "clp_commands"
<<<<<<< HEAD
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:416:1: clp_commands : ( ( create_db | drop_db | list_db | start | get_status | stop | display_db ) ( clp_commands | dml_commands | ddl_commands ) |);
	public final void clp_commands() throws  {
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:417:2: ( ( create_db | drop_db | list_db | start | get_status | stop | display_db ) ( clp_commands | dml_commands | ddl_commands ) |)
=======
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:399:1: clp_commands : ( ( create_db | drop_db | list_db | start | get_status | stop | display_db ) ( clp_commands | dml_commands | ddl_commands ) |);
	public final void clp_commands()   {
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:400:2: ( ( create_db | drop_db | list_db | start | get_status | stop | display_db ) ( clp_commands | dml_commands | ddl_commands ) |)
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==CREATE||(LA53_0 >= DISPLAY && LA53_0 <= DROP)||LA53_0==GET||LA53_0==LIST||LA53_0==START||LA53_0==STOP) ) {
				alt53=1;
			}
			else if ( (LA53_0==EOF) ) {
				alt53=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}

			switch (alt53) {
				case 1 :
<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:417:4: ( create_db | drop_db | list_db | start | get_status | stop | display_db ) ( clp_commands | dml_commands | ddl_commands )
					{
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:417:4: ( create_db | drop_db | list_db | start | get_status | stop | display_db )
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:400:4: ( create_db | drop_db | list_db | start | get_status | stop | display_db ) ( clp_commands | dml_commands | ddl_commands )
					{
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:400:4: ( create_db | drop_db | list_db | start | get_status | stop | display_db )
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					int alt51=7;
					switch ( input.LA(1) ) {
					case CREATE:
						{
						alt51=1;
						}
						break;
					case DROP:
						{
						alt51=2;
						}
						break;
					case LIST:
						{
						alt51=3;
						}
						break;
					case START:
						{
						alt51=4;
						}
						break;
					case GET:
						{
						alt51=5;
						}
						break;
					case STOP:
						{
						alt51=6;
						}
						break;
					case DISPLAY:
						{
						alt51=7;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 51, 0, input);
						throw nvae;
					}
					switch (alt51) {
						case 1 :
<<<<<<< HEAD
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:417:6: create_db
=======
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:400:6: create_db
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
							{
							pushFollow(FOLLOW_create_db_in_clp_commands1189);
							create_db();
							state._fsp--;

							}
							break;
						case 2 :
<<<<<<< HEAD
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:418:4: drop_db
=======
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:401:4: drop_db
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
							{
							pushFollow(FOLLOW_drop_db_in_clp_commands1194);
							drop_db();
							state._fsp--;

							}
							break;
						case 3 :
<<<<<<< HEAD
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:419:4: list_db
=======
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:402:4: list_db
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
							{
							pushFollow(FOLLOW_list_db_in_clp_commands1199);
							list_db();
							state._fsp--;

							}
							break;
						case 4 :
<<<<<<< HEAD
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:420:4: start
=======
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:403:4: start
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
							{
							pushFollow(FOLLOW_start_in_clp_commands1204);
							start();
							state._fsp--;

							}
							break;
						case 5 :
<<<<<<< HEAD
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:421:4: get_status
=======
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:404:4: get_status
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
							{
							pushFollow(FOLLOW_get_status_in_clp_commands1209);
							get_status();
							state._fsp--;

							}
							break;
						case 6 :
<<<<<<< HEAD
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:422:4: stop
=======
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:405:4: stop
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
							{
							pushFollow(FOLLOW_stop_in_clp_commands1214);
							stop();
							state._fsp--;

							}
							break;
						case 7 :
<<<<<<< HEAD
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:423:4: display_db
=======
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:406:4: display_db
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
							{
							pushFollow(FOLLOW_display_db_in_clp_commands1219);
							display_db();
							state._fsp--;

							}
							break;

					}

<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:423:17: ( clp_commands | dml_commands | ddl_commands )
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:406:17: ( clp_commands | dml_commands | ddl_commands )
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					int alt52=3;
					switch ( input.LA(1) ) {
					case CREATE:
						{
						int LA52_1 = input.LA(2);
						if ( (LA52_1==DATABASE) ) {
							alt52=1;
						}
						else if ( (LA52_1==INDEX||LA52_1==TABLE) ) {
							alt52=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 52, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case DROP:
						{
						int LA52_2 = input.LA(2);
						if ( (LA52_2==DATABASE) ) {
							alt52=1;
						}
						else if ( (LA52_2==TABLE) ) {
							alt52=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 52, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case DISPLAY:
					case GET:
					case LIST:
					case START:
					case STOP:
						{
						alt52=1;
						}
						break;
					case EOF:
						{
						alt52=1;
						}
						break;
					case DELETE:
					case INSERT:
					case SELECT:
					case UPDATE:
						{
						alt52=2;
						}
						break;
					case ALTER:
					case SET:
						{
						alt52=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 52, 0, input);
						throw nvae;
					}
					switch (alt52) {
						case 1 :
<<<<<<< HEAD
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:423:19: clp_commands
=======
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:406:19: clp_commands
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
							{
							pushFollow(FOLLOW_clp_commands_in_clp_commands1225);
							clp_commands();
							state._fsp--;

							}
							break;
						case 2 :
<<<<<<< HEAD
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:424:4: dml_commands
=======
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:407:4: dml_commands
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
							{
							pushFollow(FOLLOW_dml_commands_in_clp_commands1230);
							dml_commands();
							state._fsp--;

							}
							break;
						case 3 :
<<<<<<< HEAD
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:425:4: ddl_commands
=======
							// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:408:4: ddl_commands
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
							{
							pushFollow(FOLLOW_ddl_commands_in_clp_commands1235);
							ddl_commands();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:427:2: 
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:410:2: 
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "clp_commands"



	// $ANTLR start "create_db"
<<<<<<< HEAD
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:430:1: create_db : CREATE DATABASE ID ( NEWLINE )* ;
	public final void create_db() throws  {
		Token ID25=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:431:2: ( CREATE DATABASE ID ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:431:4: CREATE DATABASE ID ( NEWLINE )*
=======
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:413:1: create_db : CREATE DATABASE ID ( NEWLINE )* ;
	public final void create_db()   {
		Token ID25=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:414:2: ( CREATE DATABASE ID ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:414:4: CREATE DATABASE ID ( NEWLINE )*
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
			{
			match(input,CREATE,FOLLOW_CREATE_in_create_db1256); 
			match(input,DATABASE,FOLLOW_DATABASE_in_create_db1258); 
			ID25=(Token)match(input,ID,FOLLOW_ID_in_create_db1260); 
<<<<<<< HEAD
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:431:23: ( NEWLINE )*
=======
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:414:23: ( NEWLINE )*
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==NEWLINE) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:431:23: NEWLINE
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:414:23: NEWLINE
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_create_db1262); 
					}
					break;

				default :
					break loop54;
				}
			}

			System.out.println("Creating database " + (ID25!=null?ID25.getText():null) + "...\n");

				 	// Crear base de datos
				 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "create_db"



	// $ANTLR start "drop_db"
<<<<<<< HEAD
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:438:1: drop_db : DROP DATABASE ID ( NEWLINE )* ;
	public final void drop_db() throws  {
		Token ID26=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:439:2: ( DROP DATABASE ID ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:439:4: DROP DATABASE ID ( NEWLINE )*
=======
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:421:1: drop_db : DROP DATABASE ID ( NEWLINE )* ;
	public final void drop_db()   {
		Token ID26=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:422:2: ( DROP DATABASE ID ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:422:4: DROP DATABASE ID ( NEWLINE )*
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
			{
			match(input,DROP,FOLLOW_DROP_in_drop_db1283); 
			match(input,DATABASE,FOLLOW_DATABASE_in_drop_db1285); 
			ID26=(Token)match(input,ID,FOLLOW_ID_in_drop_db1287); 
<<<<<<< HEAD
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:439:21: ( NEWLINE )*
=======
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:422:21: ( NEWLINE )*
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==NEWLINE) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:439:21: NEWLINE
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:422:21: NEWLINE
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_drop_db1289); 
					}
					break;

				default :
					break loop55;
				}
			}

			System.out.println("Deleting database " + (ID26!=null?ID26.getText():null) + "...\n");

				 	// Eliminar base de datos
				 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "drop_db"



	// $ANTLR start "list_db"
<<<<<<< HEAD
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:446:1: list_db : LIST DATABASES ( NEWLINE )* ;
	public final void list_db() throws  {
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:447:2: ( LIST DATABASES ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:447:4: LIST DATABASES ( NEWLINE )*
			{
			match(input,LIST,FOLLOW_LIST_in_list_db1310); 
			match(input,DATABASES,FOLLOW_DATABASES_in_list_db1312); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:447:19: ( NEWLINE )*
=======
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:429:1: list_db : LIST DATABASES ( NEWLINE )* ;
	public final void list_db()  {
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:430:2: ( LIST DATABASES ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:430:4: LIST DATABASES ( NEWLINE )*
			{
			match(input,LIST,FOLLOW_LIST_in_list_db1310); 
			match(input,DATABASES,FOLLOW_DATABASES_in_list_db1312); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:430:19: ( NEWLINE )*
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==NEWLINE) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:447:19: NEWLINE
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:430:19: NEWLINE
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_list_db1314); 
					}
					break;

				default :
					break loop56;
				}
			}

			System.out.println("Listing databases...\n");

				 	// Mostrar las bases de datos que hay
				 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "list_db"



	// $ANTLR start "start"
<<<<<<< HEAD
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:454:1: start : START ( NEWLINE )* ;
	public final void start() throws  {
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:455:2: ( START ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:455:4: START ( NEWLINE )*
			{
			match(input,START,FOLLOW_START_in_start1335); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:455:10: ( NEWLINE )*
=======
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:437:1: start : START ( NEWLINE )* ;
	public final void start()   {
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:438:2: ( START ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:438:4: START ( NEWLINE )*
			{
			match(input,START,FOLLOW_START_in_start1335); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:438:10: ( NEWLINE )*
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==NEWLINE) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:455:10: NEWLINE
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:438:10: NEWLINE
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_start1337); 
					}
					break;

				default :
					break loop57;
				}
			}

			System.out.println("Starting processes...\n");

				 	// Iniciar los procesos
				 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "start"



	// $ANTLR start "get_status"
<<<<<<< HEAD
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:462:1: get_status : GET STATUS ( NEWLINE )* ;
	public final void get_status() throws  {
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:463:2: ( GET STATUS ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:463:4: GET STATUS ( NEWLINE )*
			{
			match(input,GET,FOLLOW_GET_in_get_status1358); 
			match(input,STATUS,FOLLOW_STATUS_in_get_status1360); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:463:15: ( NEWLINE )*
=======
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:445:1: get_status : GET STATUS ( NEWLINE )* ;
	public final void get_status()   {
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:446:2: ( GET STATUS ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:446:4: GET STATUS ( NEWLINE )*
			{
			match(input,GET,FOLLOW_GET_in_get_status1358); 
			match(input,STATUS,FOLLOW_STATUS_in_get_status1360); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:446:15: ( NEWLINE )*
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==NEWLINE) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:463:15: NEWLINE
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:446:15: NEWLINE
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_get_status1362); 
					}
					break;

				default :
					break loop58;
				}
			}

			System.out.println("Obtaining status...\n");

				 	// Obtener el estado de los procesos
				 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "get_status"



	// $ANTLR start "stop"
<<<<<<< HEAD
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:470:1: stop : STOP ( NEWLINE )* ;
	public final void stop() throws  {
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:471:2: ( STOP ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:471:4: STOP ( NEWLINE )*
			{
			match(input,STOP,FOLLOW_STOP_in_stop1383); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:471:9: ( NEWLINE )*
=======
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:453:1: stop : STOP ( NEWLINE )* ;
	public final void stop()   {
		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:454:2: ( STOP ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:454:4: STOP ( NEWLINE )*
			{
			match(input,STOP,FOLLOW_STOP_in_stop1383); 
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:454:9: ( NEWLINE )*
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==NEWLINE) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:471:9: NEWLINE
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:454:9: NEWLINE
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_stop1385); 
					}
					break;

				default :
					break loop59;
				}
			}

			System.out.println("Stoping processes...\n");

				 	// Detener los procesos
				 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stop"



	// $ANTLR start "display_db"
<<<<<<< HEAD
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:478:1: display_db : DISPLAY DATABASE ID ( NEWLINE )* ;
	public final void display_db() throws  {
		Token ID27=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:479:2: ( DISPLAY DATABASE ID ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:479:4: DISPLAY DATABASE ID ( NEWLINE )*
=======
	// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:461:1: display_db : DISPLAY DATABASE ID ( NEWLINE )* ;
	public final void display_db()   {
		Token ID27=null;

		try {
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:462:2: ( DISPLAY DATABASE ID ( NEWLINE )* )
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:462:4: DISPLAY DATABASE ID ( NEWLINE )*
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
			{
			match(input,DISPLAY,FOLLOW_DISPLAY_in_display_db1406); 
			match(input,DATABASE,FOLLOW_DATABASE_in_display_db1408); 
			ID27=(Token)match(input,ID,FOLLOW_ID_in_display_db1410); 
<<<<<<< HEAD
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:479:24: ( NEWLINE )*
=======
			// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:462:24: ( NEWLINE )*
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==NEWLINE) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
<<<<<<< HEAD
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:479:24: NEWLINE
=======
					// /home/hector/Dropbox/TEC/Bases de Datos/Proyecto 1/urSQL.g:462:24: NEWLINE
>>>>>>> 1f03cd2a3299d1c64262dbaf2afde7d8e597d95b
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_display_db1412); 
					}
					break;

				default :
					break loop60;
				}
			}

			System.out.println("Displaying database " + (ID27!=null?ID27.getText():null) + "...\n");

				 	// Mostrar la base de datos indicada
				 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "display_db"

	// Delegated rules



	public static final BitSet FOLLOW_clp_commands_in_programa57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ddl_commands_in_programa62 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dml_commands_in_programa67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_in_dml_commands84 = new BitSet(new long[]{0xE004004080E10040L,0x0000000000000022L});
	public static final BitSet FOLLOW_update_in_dml_commands89 = new BitSet(new long[]{0xE004004080E10040L,0x0000000000000022L});
	public static final BitSet FOLLOW_delete_in_dml_commands94 = new BitSet(new long[]{0xE004004080E10040L,0x0000000000000022L});
	public static final BitSet FOLLOW_insert_in_dml_commands99 = new BitSet(new long[]{0xE004004080E10040L,0x0000000000000022L});
	public static final BitSet FOLLOW_clp_commands_in_dml_commands105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ddl_commands_in_dml_commands110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dml_commands_in_dml_commands115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_select132 = new BitSet(new long[]{0x0038001040008120L});
	public static final BitSet FOLLOW_ALL_in_select136 = new BitSet(new long[]{0x0020000040000000L});
	public static final BitSet FOLLOW_col_list_in_select143 = new BitSet(new long[]{0x0020000040000000L});
	public static final BitSet FOLLOW_NEWLINE_in_select147 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_from_in_select150 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_select152 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_ID_in_col_list170 = new BitSet(new long[]{0x0018001000008100L});
	public static final BitSet FOLLOW_agg_funct_in_col_list181 = new BitSet(new long[]{0x0018001000008100L});
	public static final BitSet FOLLOW_col_list_in_col_list185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FROM_in_from202 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_from206 = new BitSet(new long[]{0x0020000410000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_join_st_in_from213 = new BitSet(new long[]{0x0020000410000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_from217 = new BitSet(new long[]{0x0020000410000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_where_in_from220 = new BitSet(new long[]{0x0020000410000002L});
	public static final BitSet FOLLOW_NEWLINE_in_from223 = new BitSet(new long[]{0x0020000410000002L});
	public static final BitSet FOLLOW_group_in_from226 = new BitSet(new long[]{0x0020000010000002L});
	public static final BitSet FOLLOW_NEWLINE_in_from229 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_for_JSON_XML_in_from232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_join_st249 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_JOIN_in_join_st251 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_join_st257 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_join_st_aux_in_join_st259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOIN_in_join_st_aux275 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_join_st_aux277 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_join_st_aux_in_join_st_aux279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_where298 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_where_st_in_where300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_where_st312 = new BitSet(new long[]{0x0043800301000000L});
	public static final BitSet FOLLOW_comp_op_in_where_st314 = new BitSet(new long[]{0x0000009008000000L});
	public static final BitSet FOLLOW_value_in_where_st316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_where_st324 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_null_op_in_where_st326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_THAN_in_comp_op340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_EQUALS_in_comp_op347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESS_THAN_in_comp_op354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESS_EQUALS_in_comp_op361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_comp_op368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIKE_in_comp_op375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_comp_op382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IS_in_null_op396 = new BitSet(new long[]{0x00C0000000000000L});
	public static final BitSet FOLLOW_NULL_in_null_op400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_null_op411 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_NULL_in_null_op413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_in_group433 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_BY_in_group435 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_cols_in_group437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_cols449 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_cols_in_cols451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_JSON_XML468 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_JSON_in_for_JSON_XML472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XML_in_for_JSON_XML479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_agg_funct497 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_AVERAGE_in_agg_funct504 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_MIN_in_agg_funct511 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_MAX_in_agg_funct518 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LEFT_PAR_in_agg_funct526 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_agg_funct528 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAR_in_agg_funct532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UPDATE_in_update544 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_update550 = new BitSet(new long[]{0x4020000000000000L});
	public static final BitSet FOLLOW_NEWLINE_in_update552 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_SET_in_update555 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_update561 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_EQUALS_in_update563 = new BitSet(new long[]{0x0000009008000000L});
	public static final BitSet FOLLOW_value_in_update565 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_update568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_where_in_update571 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_update573 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_DELETE_in_delete590 = new BitSet(new long[]{0x0020000040000000L});
	public static final BitSet FOLLOW_NEWLINE_in_delete592 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_FROM_in_delete595 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_delete597 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_delete599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_where_in_delete602 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_delete604 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_INSERT_in_insert621 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_INTO_in_insert623 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_insert625 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LEFT_PAR_in_insert627 = new BitSet(new long[]{0x1000001000000000L});
	public static final BitSet FOLLOW_cols_in_insert629 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAR_in_insert631 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_NEWLINE_in_insert633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VALUES_in_insert636 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LEFT_PAR_in_insert638 = new BitSet(new long[]{0x1000009008000000L});
	public static final BitSet FOLLOW_values_in_insert640 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAR_in_insert642 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_insert644 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_value_in_values661 = new BitSet(new long[]{0x0000009008000000L});
	public static final BitSet FOLLOW_values_in_values664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_value681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_value691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_value701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_db_in_ddl_commands723 = new BitSet(new long[]{0xE004004080E10040L,0x0000000000000022L});
	public static final BitSet FOLLOW_create_index_in_ddl_commands728 = new BitSet(new long[]{0xE004004080E10040L,0x0000000000000022L});
	public static final BitSet FOLLOW_drop_table_in_ddl_commands733 = new BitSet(new long[]{0xE004004080E10040L,0x0000000000000022L});
	public static final BitSet FOLLOW_alter_table_in_ddl_commands738 = new BitSet(new long[]{0xE004004080E10040L,0x0000000000000022L});
	public static final BitSet FOLLOW_create_table_in_ddl_commands743 = new BitSet(new long[]{0xE004004080E10040L,0x0000000000000022L});
	public static final BitSet FOLLOW_ddl_commands_in_ddl_commands749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dml_commands_in_ddl_commands754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_clp_commands_in_ddl_commands759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_set_db781 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DATABASE_in_set_db783 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_set_db785 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_set_db787 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_CREATE_in_create_index808 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_INDEX_in_create_index810 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_create_index816 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_ON_in_create_index818 = new BitSet(new long[]{0x0020001000000000L});
	public static final BitSet FOLLOW_NEWLINE_in_create_index820 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_create_index827 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LEFT_PAR_in_create_index829 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_create_index835 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAR_in_create_index837 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_create_index839 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_DROP_in_drop_table859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_TABLE_in_drop_table861 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_drop_table863 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_drop_table865 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_ALTER_in_alter_table887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_TABLE_in_alter_table889 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_alter_table891 = new BitSet(new long[]{0x0020000000000010L});
	public static final BitSet FOLLOW_NEWLINE_in_alter_table893 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ADD_in_alter_table896 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CONSTRAINT_in_alter_table898 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_const_def_in_alter_table900 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_alter_table903 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_FOREIGN_in_const_def918 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_KEY_in_const_def920 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LEFT_PAR_in_const_def922 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_const_def928 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAR_in_const_def930 = new BitSet(new long[]{0x0820000000000000L});
	public static final BitSet FOLLOW_NEWLINE_in_const_def932 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_REFERENCES_in_const_def935 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_const_def941 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LEFT_PAR_in_const_def943 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_const_def949 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAR_in_const_def951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_create_table970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_TABLE_in_create_table972 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_create_table974 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_AS_in_create_table976 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LEFT_PAR_in_create_table978 = new BitSet(new long[]{0x0420001000000000L});
	public static final BitSet FOLLOW_NEWLINE_in_create_table980 = new BitSet(new long[]{0x0400001000000000L});
	public static final BitSet FOLLOW_col_def_in_create_table983 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_p_key_in_create_table985 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAR_in_create_table987 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_create_table989 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_ID_in_col_def1009 = new BitSet(new long[]{0x0000010000180800L,0x0000000000000080L});
	public static final BitSet FOLLOW_type_in_col_def1011 = new BitSet(new long[]{0x00C0000000000000L});
	public static final BitSet FOLLOW_null_cons_in_col_def1013 = new BitSet(new long[]{0x0020001000000000L});
	public static final BitSet FOLLOW_NEWLINE_in_col_def1015 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_col_def_in_col_def1018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_in_type1052 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LEFT_PAR_in_type1054 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_INT_in_type1060 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COLON_in_type1062 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_INT_in_type1068 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAR_in_type1070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_type1080 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LEFT_PAR_in_type1082 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_INT_in_type1084 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAR_in_type1086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARCHAR_in_type1096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATETIME_in_type1106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_null_cons1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_null_cons1136 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_NULL_in_null_cons1138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIMARY_in_p_key1158 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_KEY_in_p_key1160 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LEFT_PAR_in_p_key1162 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_p_key1164 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_RIGHT_PAR_in_p_key1166 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_p_key1168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_create_db_in_clp_commands1189 = new BitSet(new long[]{0xE004004080E10040L,0x0000000000000022L});
	public static final BitSet FOLLOW_drop_db_in_clp_commands1194 = new BitSet(new long[]{0xE004004080E10040L,0x0000000000000022L});
	public static final BitSet FOLLOW_list_db_in_clp_commands1199 = new BitSet(new long[]{0xE004004080E10040L,0x0000000000000022L});
	public static final BitSet FOLLOW_start_in_clp_commands1204 = new BitSet(new long[]{0xE004004080E10040L,0x0000000000000022L});
	public static final BitSet FOLLOW_get_status_in_clp_commands1209 = new BitSet(new long[]{0xE004004080E10040L,0x0000000000000022L});
	public static final BitSet FOLLOW_stop_in_clp_commands1214 = new BitSet(new long[]{0xE004004080E10040L,0x0000000000000022L});
	public static final BitSet FOLLOW_display_db_in_clp_commands1219 = new BitSet(new long[]{0xE004004080E10040L,0x0000000000000022L});
	public static final BitSet FOLLOW_clp_commands_in_clp_commands1225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dml_commands_in_clp_commands1230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ddl_commands_in_clp_commands1235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_create_db1256 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DATABASE_in_create_db1258 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_create_db1260 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_create_db1262 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_DROP_in_drop_db1283 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DATABASE_in_drop_db1285 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_drop_db1287 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_drop_db1289 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_LIST_in_list_db1310 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DATABASES_in_list_db1312 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_list_db1314 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_START_in_start1335 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_start1337 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_GET_in_get_status1358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STATUS_in_get_status1360 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_get_status1362 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_STOP_in_stop1383 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_stop1385 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_DISPLAY_in_display_db1406 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DATABASE_in_display_db1408 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_ID_in_display_db1410 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_display_db1412 = new BitSet(new long[]{0x0020000000000002L});
}
