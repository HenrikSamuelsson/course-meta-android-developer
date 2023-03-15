# Advanced Classes Nullability and Collections

## Sealed Classes and Interfaces

A class and interface can be marked with the 'sealed' keyword indicating restrictions on inheritance. The sealed class will has it constructors protected by default. All direct subclasses of a sealed class must be defined at compile time.

A benefit of using sealed classes is that `when` expression can cover all cases without the need for a `else` clause.
