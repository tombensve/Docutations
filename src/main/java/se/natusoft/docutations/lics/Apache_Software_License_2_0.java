package se.natusoft.docutations.lics;

import se.natusoft.docutations.Documentative;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Documentative
@Retention(RetentionPolicy.RUNTIME)
public @interface Apache_Software_License_2_0 {

    String text() default "Apache 2.0 (Open Source)\n" +
            "\n" +
            "        Licensed under the Apache License, Version 2.0 (the \"License\");\n" +
            "        you may not use this file except in compliance with the License.\n" +
            "        You may obtain a copy of the License at\n" +
            "\n" +
            "          http://www.apache.org/licenses/LICENSE-2.0\n" +
            "\n" +
            "        Unless required by applicable law or agreed to in writing, software\n" +
            "        distributed under the License is distributed on an \"AS IS\" BASIS,\n" +
            "        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n" +
            "        See the License for the specific language governing permissions and\n" +
            "        limitations under the License.\n";
}
