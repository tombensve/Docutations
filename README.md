# Docutations

Copyright © 2015 Natusoft AB

__Version:__ 2.0

__Author:__ Tommy Svensson (tommy@natusoft.se)

__License:__ [ASF-2.0](http://www.apache.org/licenses/LICENSE-2.0)

---

This is a set of annotations for the purpose of documenting code. They provide no functionality, their only
intention is to clarify code.

## History

### 2.0

Removed @NotNull and @Nullable and added a dependency to jetbrains-annotations instead. jetbrains-annotations provide these 2 and if you are working in IntelliJ IDEA then it will make use of those annotations to show potential errors. If you do not use IDEA then they will have the same functionality as mine did.

This is of course not backwards compatible, which is why I bumped the version to 2.0.

[Javadoc](http://apidoc.natusoft.se/Docutations/)
