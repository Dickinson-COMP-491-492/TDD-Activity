# TDD-Activity

An activity for illustrating / practicing TDD.

## Current Contents

The commits to this repository are as follows:

- `5b9c418` Initial commit
- `6c69861` Create README.md
- `eee8ae1` Added test for default Password
- `45e9530` Finished test for default Password
- `c1a234f` Wrote Password class to pass first test
- `9970376` Corrected test for default password
- `f3cf2b3` Wrote test for client specified password
- `372d1e6` Added constructor for client password
- `de9e6c9` Added test for password too short

These commits follow a TDD approach, first creating the tests and then adding
the code that allows the test to pass.  You can view the code in any state using
the command `git checkout <SHA>` where `<SHA>` is the 7 digit hex number before
the commit listed above.

## First Task:

The final commit listed above has added a test that checks that the 
`Password` constructor throws an exception if the password is less than
eight characters long.  However, the code to allow this test to pass has 
not yet been written.  So you should now:

- Run the test suite to see the failing test.
- Add code to the `Password` class to pass the failing test.

Note: Many TDD advocates suggest leaving your work for the day 
with a failing test. They argue that this helps get you back into
the workflow by giving you something very concrete to do when you return.

## Additional Requirements

Further practice with TDD can be gained by using TDD to satisfy the 
following additional requirements:

- Passwords must contain at least:
  - one digit
  - one capital letter
  - one lower case letter
  - one special character (!@#$5^&*) 
  - Anything else you might want to add...