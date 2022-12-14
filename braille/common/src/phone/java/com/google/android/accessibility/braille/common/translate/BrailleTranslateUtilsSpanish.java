/*
 * Copyright 2020 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.accessibility.braille.common.translate;

import com.google.android.accessibility.braille.interfaces.BrailleCharacter;

/** Utils for translation of Spanish Braille. */
public class BrailleTranslateUtilsSpanish {

  public static final BrailleCharacter CAPITALIZE = new BrailleCharacter(4, 6);
  public static final BrailleCharacter PERIOD = new BrailleCharacter(3);
  public static final BrailleCharacter SEMICOLON = new BrailleCharacter(2, 3);
  public static final BrailleCharacter COLON = new BrailleCharacter(2, 5);
  public static final BrailleCharacter QUESTION_MARK = new BrailleCharacter(2, 6);
  public static final BrailleCharacter EXCLAMATION_MARK = new BrailleCharacter(2, 3, 5);

  private BrailleTranslateUtilsSpanish() {}
}
