/**
 * Copyright 2016 Goldman Sachs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.gs.dmn.feel.analysis;

import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;

/**
 * Created by Octavian Patrascoiu on 18/05/2017.
 */
public interface FEELExpressionsAnalyzer {
    Expression parseExpression(String text);

    Expression parseSimpleExpressions(String text);

    Expression parseTextualExpressions(String text);

    Expression parseBoxedExpression(String text);

    Expression analyzeExpression(String text, FEELContext context);

    Expression analyzeSimpleExpressions(String text, FEELContext context);

    Expression analyzeTextualExpressions(String text, FEELContext context);

    Expression analyzeBoxedExpression(String text, FEELContext context);
}
