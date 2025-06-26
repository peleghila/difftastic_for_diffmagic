#!/bin/bash

echo "▶ Running diffmagic(target/release/difft)"
./target/release/difft /mnt/c/Users/Bitroix/Desktop/Technion/Diff/difftastic/Files/lhs /mnt/c/Users/Bitroix/Desktop/Technion/Diff/difftastic/Files/rhs > /mnt/c/Users/Bitroix/Desktop/Technion/Diff/difftastic/Files/result.txt
echo "✅ Saved to Files/result.txt"

echo
echo "▶ Running expected(bin/release/difft)"
./bin/difft /mnt/c/Users/Bitroix/Desktop/Technion/Diff/difftastic/Files/lhs /mnt/c/Users/Bitroix/Desktop/Technion/Diff/difftastic/Files/rhs > /mnt/c/Users/Bitroix/Desktop/Technion/Diff/difftastic/Files/expected.txt
echo "✅ Saved to Files/expected.txt"
