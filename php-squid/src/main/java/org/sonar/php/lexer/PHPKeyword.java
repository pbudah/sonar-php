/*
 * Sonar PHP Plugin
 * Copyright (C) 2010 Codehaus Sonar Plugins
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.php.lexer;

import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.TokenType;

public enum PHPKeyword implements TokenType {

  // Reserved words

  NULL("null"),
  TRUE("true"),
  FALSE("false"),

  // Keywords

  HALT_COMPILER("__halt_compiler"),
  ABSTRACT("abstract"),
  AND("and"),
  ARRAY("array"),
  AS("as"),
  BREAK("break"),
  CALLABLE("callable"),
  CASE("case"),
  CATCH("catch"),
  CLASS("class"),
  CLONE("clone"),
  CONST("const"),
  CONTINUE("continue"),
  DECLARE("declare"),
  DEFAULT("default"),
  DIE("die"),
  DO("do"),
  ECHO("echo"),
  ELSE("else"),
  ELSEIF("elseif"),
  EMPTY("empty"),
  ENDDECLARE("enddeclare"),
  ENDFOR("endfor"),
  ENDFOREACH("endforeach"),
  ENDIF("endif"),
  ENDSWITCH("endswitch"),
  ENDWHILE("endwhile"),
  EVAL("eval"),
  EXIT("exit"),
  EXTENDS("extends"),
  FINAL("final"),
  FINALLY("finally"),
  FOR("for"),
  FOREACH("foreach"),
  FUNCTION("function"),
  GLOBAL("global"),
  GOTO("goto"),
  IF("if"),
  IMPLEMENTS("implements"),
  INCLUDE("include"),
  INCLUDE_ONCE("include_once"),
  INSTANCEOF("instanceof"),
  INSTEADOF("insteadof"),
  INTERFACE("interface"),
  ISSET("isset"),
  LIST("list"),
  NAMESPACE("namespace"),
  NEW("new"),
  OR("or"),
  PRINT("print"),
  PRIVATE("private"),
  PROTECTED("protected"),
  PUBLIC("public"),
  REQUIRE("require"),
  REQUIRE_ONCE("require_once"),
  RETURN("return"),
  STATIC("static"),
  SWITCH("switch"),
  THROW("throw"),
  TRAIT("trait"),
  TRY("try"),
  UNSET("unset"),
  USE("use"),
  VAR("var"),
  WHILE("while"),
  XOR("xor"),
  YIELD("yield"),

  // Reserved name
  CONSTANT_CLASS("__CLASS__"),
  CONSTANT_FUNCTION("__FUNCTION__"),
  CONSTANT_FILE("__FILE__"),
  CONSTANT_LINE("__LINE__"),
  CONSTANT_METHOD("__METHOD__"),
  CONSTANT_NAMESPACE("__NAMESPACE__"),
  CONSTANT_TRAIT("__TRAIT__");

  private final String value;

  private PHPKeyword(String value) {
    this.value = value;
  }

  @Override
  public boolean hasToBeSkippedFromAst(AstNode astNode) {
    return false;
  }

  @Override
  public String getName() {
    return name();
  }

  @Override
  public String getValue() {
    return value;
  }

  public static String[] getKeywordValues() {
    PHPKeyword[] keywordsEnum = PHPKeyword.values();
    String[] keywords = new String[keywordsEnum.length];
    for (int i = 0; i < keywords.length; i++) {
      keywords[i] = keywordsEnum[i].getValue();
    }
    return keywords;
  }


}
