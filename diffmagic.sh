#!/bin/bash

# Hardcoded base path
BASE_PATH="/mnt/c/Users/Bitroix/Desktop/Technion/Diff/difftastic"

echo "▶ Running diffmagic(target/release/difft)"
"$BASE_PATH/target/release/difft" --width 200 "$BASE_PATH/Files/lhs" "$BASE_PATH/Files/rhs" > "$BASE_PATH/Files/result.txt"
echo "✅ Saved to $BASE_PATH/Files/result.txt"

echo
echo "▶ Running expected(bin/release/difft)"
"$BASE_PATH/bin/release/difft" --width 200 "$BASE_PATH/Files/lhs" "$BASE_PATH/Files/rhs" > "$BASE_PATH/Files/expected.txt"
echo "✅ Saved to $BASE_PATH/Files/expected.txt"