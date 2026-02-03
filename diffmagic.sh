#!/bin/bash

# Get the directory where this script is located
BASE_PATH="$(cd "$(dirname "$0")" && pwd)"

echo "▶ Running diffmagic(target/release/difft) - Processing files individually to avoid memory issues"

# Clear or create result file
> "$BASE_PATH/Files/result.txt"

# Find all Java files in lhs directory and process them one by one (sorted for consistent ordering)
find "$BASE_PATH/Files/lhs" -name "*.java" -type f | sort | while read -r lhs_file; do
    # Get the relative path from lhs directory
    rel_path="${lhs_file#$BASE_PATH/Files/lhs/}"
    rhs_file="$BASE_PATH/Files/rhs/$rel_path"
    
    # Check if corresponding rhs file exists
    if [ -f "$rhs_file" ]; then
        echo "Processing: $rel_path"
        "$BASE_PATH/target/release/difft_debug" --width 200 "$lhs_file" "$rhs_file" >> "$BASE_PATH/Files/result.txt" 2>&1
        echo -e "\n==========================================\n" >> "$BASE_PATH/Files/result.txt"
    fi
done

echo "✅ Saved to $BASE_PATH/Files/result.txt"

# echo
# echo "▶ Running expected(bin/release/difft)"
# "$BASE_PATH/bin/release/difft" --width 200 "$BASE_PATH/Files/lhs" "$BASE_PATH/Files/rhs" > "$BASE_PATH/Files/expected.txt"
# echo "✅ Saved to $BASE_PATH/Files/expected.txt"