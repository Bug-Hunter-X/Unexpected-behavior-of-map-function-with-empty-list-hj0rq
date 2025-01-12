# Kotlin Empty List Map Behavior

This example demonstrates the behavior of the `map` function in Kotlin when applied to an empty list.  The `map` function, while generally robust, returns an empty list when operating on an empty input.  While this is technically correct and avoids exceptions, it might lead to unexpected program behavior if not handled properly. The solution provides a safer way to deal with empty lists in map operations.

## Bug

The primary bug demonstrated is the lack of an explicit indication or exception when mapping over an empty list. This behavior might be counterintuitive to developers accustomed to explicit error handling mechanisms.