# Financial

### Build
```
lein uberjar
```

### Create Function
```
aws lambda create-function \
  --function-name clj-financial \
  --handler financial.core::handler \
  --runtime java11 \
  --memory 512 \
  --timeout 10 \
  --role arn:aws:iam::954767414836:role/AwsLambdaFullAccess \
  --zip-file fileb://./target/uberjar/financial-0.1.0-SNAPSHOT-standalone.jar
```

### Delete function
```
aws lambda delete-function \
  --function-name clj-financial
```

### Update function
```
aws lambda update-function-code \
  --function-name clj-financial \
  --zip-file fileb://./target/uberjar/financial-0.1.0-SNAPSHOT-standalone.jar
```

### Invoke function

`payload.json`:

```json
{
  "rate": 0.02,
  "nper": 12,
  "pv": 100000
}
```

```
aws lambda invoke \
  --function-name clj-financial \
  --payload fileb://~/payload.json \
  ~/output.txt
```

## Installation

Download from http://example.com/FIXME.

## Usage

FIXME: explanation

    $ java -jar auth-0.1.0-standalone.jar [args]

## Options

FIXME: listing of options this app accepts.

## Examples

...

### Bugs

...

### Any Other Sections
### That You Think
### Might be Useful

## License

Copyright © 2021 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
