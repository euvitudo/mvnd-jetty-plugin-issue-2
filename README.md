# mvnd-jetty-plugin-issue-2

This repository provides an example where using mvnd to build a project with two jetty-based integration-test modules will fail with version 10.0.12 (and all others, afaik).

Commit `9293178cd442e68c2df5512a27404f270009c95a` in the `jetty-10.0.x-mvnd-issue` branch located here:
[euvitudo/jetty.project](https://github.com/euvitudo/jetty.project) provides a possible fix for this issue.

## parent pom.xml

The parent pom.xml file contains a properties tag with versions that can be used (once the `jetty-10.0.x-mvnd-issue` has been built.

## Running

Running `mvnd` with 10.0.12 (and other versions) will show this failure.

Running `mvnd` with the commit in `jetty-10.0.x-mvnd-issue` will allow the build to succeed.
