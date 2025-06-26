#!/bin/bash

echo "▶ Running diffmagic(target/release/difft)"
./target/release/difft Files/lhs Files/rhs > Files/result.txt
echo "✅ Saved to Files/result.txt"

echo
echo "▶ Running expected(bin/release/difft)"
./bin/release/difft Files/lhs Files/rhs > Files/expected.txt
echo "✅ Saved to Files/expected.txt"
