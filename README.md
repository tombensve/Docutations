# Docutations

Copyright © 2015 Natusoft AB

__Version:__ 8.0.0-BC11

__Author:__ Tommy Svensson (tommy@natusoft.se)

__License:__ [ASF-2.0](http://www.apache.org/licenses/LICENSE-2.0)

---

This is a set of annotations for the purpose of documenting code. They provide no functionality, their only intention is to clarify code.

I am personally no longer using @Reactive and @Fluent. They were
inspired by Vert.x, but I don't consider that information to be important enough to actually point out. If an API is reactive or fluent is quite clear by just looking at it. I however left the annotations to not break anything (like I in 2.0 which did break usage of Docutations variants of @NotNull @Nullable).

# Binaries

[Accessing binaries](https://github.com/tombensve/CommonStuff/blob/master/docs/AccessingBinaries.md)

----

# History

## 8.0.0-BC11

I did have the idea to use annotations to document code and make a tool that picks upp
these annotations and generates documentation. This to handle both Java and Groovy code
the same way. 

I have failed, failed, and failed to generate Groovy docs, and to document the same
way using same tool independent of java or groovy felt nice. But I decided that if 
I do such a thing it will be a project of itself, and such annotations should not
be in this one. 

So all those type of annotations in this project have now been removed! They should never
have been added here to begin with,

## 7.0.0-BC11

New version format. Since this affects the binaries it also warrants a new version IMHO!

## 6.0.0 

Undid 5.0.1, since that turned out to be both annoying and stupid. Deleted 1 or 2 annotations, don't 
remember which! 

## 5.0.1

Added @DOC_Unique and @DocNotUnique.

## 5.0.0

Changed "DT" prefix to "DOC", to be clearer!

## 4.0.1 

Added DT_ReadOnly, DT_WriteOnly and DT_ReadWrite 

## 4.0.0 

All annotations are now prefixed with "DT_" to make them more identifiable.

## 3.0.5

Added a few annotations, like @InternalAPI, @PublicAPI, @ImplNotProvided. 

## 3.0.4

Updated _@CodeDoc_ with some more parameters.

## 3.0.3

Added _@CodeDoc_ annotation for future annotation processor for this producing markdown. 

## 3.0.2

Added @Doc. This is a simplified variant of 3.0.1. 

## 3.0.1

Added 2 simple documentatative annotations: @Description, @Property, @Param.

## 3.0.0

Changed to SOURCE retention for all annotations! 

I don't know what I was thinking or if I was thinking at all before! 

I strongly suspect that I'm the only one using these anyhow :-). 

## 2.13

Removed @Fluent & @Reactive.

## 2.12

Added: `@ServiceLoaded`, `@Singleton`

## 2.11

Added: `MisspelledInSpecification`

### 2.10

Added: 

   * `@Old`
   * `@Temporary`

### 2.9

Added:

   * `@Requirement` 

Modified:

   * `@Specification` - Added `url` to point to a web documentation.


### 2.8

Added: 

   * `@Teching`
   * `@Feedback`
   
2 alternatives for basically the same thing.

### 2.7

Added `@Concurrent`

This can for example be used on a method that is always called concurrently from whatever calls it, like submitted to a thread pool or whatever, just to clarify that is is called in a concurrent context.

### 2.6

Added:

   * `@AutoInstantiated`
   * `@DependencyInjected`

### 2.5

Added:

   * `@Reactive`
   * `@Fluent`

### 2.4

Added:

  * `@FailSafe`
  * `@Unbreakable`
  * `@Synonymous`
  * `@DeprecationInfo`

### 2.3

Got quite tired of IDEA and JetBrains and added `@IDEAFail` and `@JustIgnore`.

I have to admit though that even with all its fails and bad support it still beats NetBeans, and Eclipse.
For something I do pay quite a lot of money for, I do expect professional support, which is delivered
less and less.

I do love their YouTrack. And YouTrack still fully works!

### 2.2

Realized that I wanted to use `@NotNull` for the return value of a method, but my `@Target` specification for the annotation did not allow that. These are only for documentative purposes and limiting where they can be used are really stupid! __All__ annotations can now be used anywhere annotations are allowed by Java.

### 2.1

- Added `@NotNull` and `@Nullable` again because the jetbrains version of these now have 2 new Java8 annotation placements that are not compatible with Groovy. Since I personally use these in Groovy code I took these two back and removed the dependency on JetBrains annotations.

- Added some new annotations: `@Bug`, `@Specification`, `@Task`, `@Todo`, `@Version`.
   - `@Bug` and `@Task` are synonyms for `@Issue`.

### 2.0.1

Added `@NotUsed`. I had an interface implementation method that received 2 parameters of which I only actually made use of one, and thus wanted to mark the other as not used.

### 2.0

Removed `@NotNull` and `@Nullable` and added a dependency to jetbrains-annotations instead. jetbrains-annotations provide these 2 and if you are working in IntelliJ IDEA then it will make use of those annotations to show potential errors. If you do not use IDEA then they will have the same functionality as mine did.

This is of course not backwards compatible, which is why I bumped the version to 2.0.


[Javadoc](http://apidoc.natusoft.se/Docutations/)
