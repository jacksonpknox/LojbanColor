## todo list
- change action of all arguments to 'extend' (or maybe it's 'append')

- just focus on the script commands

- function that converts string to rich tree (naturally must use parse tree as intermediate type)

- build (rudimentary) grammar on top of 'lexer' grammar

- argparse
  - undo disjointness, just execute commands one after another
  - subparsers
  - tests for the parser

- decorators/meta
  - factor out loading and writing config

- toolkit
  - check selmaho disjointness
  - print every document in the library


## long term goals
- incorporate rich into cli in an elegant way
  - stating objective phase
  - reporting outcome phase
- semantically group selmaho instead of alphabetically
- color selection tool
- make a nice way to show and pick colors for word types
- grammar competition website
- tree to visual

## plan per command
 - read
   - allow multiple files
   - allow option (per file) to specify panel styling
 - add
   - allow multiple cmavo?
 - color
   - rework to 'config'
   - option to launch interactive configuration
   - options to cli config stuff with additional options
 - input
   - option to go one line at a time (maybe complicated)



## special selma'o (for special colors)
- cu
- i
- by
- koha / goha
