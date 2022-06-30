/*
 *   Copyright 2022 RenFei(i@renfei.net)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.renfei.sdk.test.security.gm.sm;

import net.renfei.sdk.security.gm.sm.SM3Util;
import net.renfei.sdk.test.Tests;
import net.renfei.sdk.utils.StringUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author renfei
 */
public class SM3UtilTest extends Tests {
    static int randomData = 128;
    static byte[] message = StringUtil.getRandomString(randomData).getBytes();

    @Test
    public void hashAndVerify() {
        byte[] hashVal = SM3Util.hash(message);
        assertTrue(SM3Util.verify(message, hashVal));

        String messageString = StringUtil.getRandomString(randomData);
        String hash = SM3Util.hash(messageString);
        assertTrue(SM3Util.verify(messageString, hash));
    }
}
