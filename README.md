# Docutations

Copyright © 2015 Natusoft AB

__Version:__ 2.1

__Author:__ Tommy Svensson (tommy@natusoft.se)

__License:__ [ASF-2.0](http://www.apache.org/licenses/LICENSE-2.0)

---

This is a set of annotations for the purpose of documenting code. They provide no functionality, their only
intention is to clarify code.

## History

### 2.0

Removed `@NotNull` and `@Nullable` and added a dependency to jetbrains-annotations instead. jetbrains-annotations provide these 2 and if you are working in IntelliJ IDEA then it will make use of those annotations to show potential errors. If you do not use IDEA then they will have the same functionality as mine did.

This is of course not backwards compatible, which is why I bumped the version to 2.0.

### 2.0.1

Added `@NotUsed`. I had an interface implementation method that received 2 parameters of which I only actually made use of one, and thus wanted to mark the other as not used.

### 2.1

- Added `@NotNull` and `@Nullable` again because the jetbrains version of these now have 2 new Java8 annotation placements that are not compatible with Groovy. Since I personally use these in Groovy code I took these two back and removed the dependency on JetBrains annotations.

- Added some new annotations: `@Bug`, `@Specification`, `@Task`, `@Todo`, `@Version`.
   - `@Bug` and `@Task` are synonyms for `@Issue`.

[Javadoc](http://apidoc.natusoft.se/Docutations/)
