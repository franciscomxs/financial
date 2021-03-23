# Build
```
lein uberjar
```

# Create Function
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

# Delete function
```
aws lambda delete-function \
  --function-name clj-financial
```

# Update function
```
aws lambda update-function-code \
  --function-name clj-financial \
  --zip-file fileb://./target/uberjar/financial-0.1.0-SNAPSHOT-standalone.jar
```

# Invoke function
```
aws lambda invoke \
  --function-name clj-financial \
  --payload fileb://~/payload.json \
  ~/out.txt
```
