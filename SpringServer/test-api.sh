#!/bin/bash

# Spring Server API Test Script
# This script demonstrates all the API endpoints

echo "====================================="
echo "Testing Spring Server API"
echo "Make sure the server is running on http://localhost:8080"
echo "====================================="

BASE_URL="http://localhost:8080/api"

echo ""
echo "1. Health Check"
echo "GET $BASE_URL/health"
curl -s "$BASE_URL/health" | json_pp
echo ""

echo ""
echo "2. Welcome Message"
echo "GET $BASE_URL/welcome"
curl -s "$BASE_URL/welcome" | json_pp
echo ""

echo ""
echo "3. Get All Users"
echo "GET $BASE_URL/users"
curl -s "$BASE_URL/users" | json_pp
echo ""

echo ""
echo "4. Get User by ID (ID: 1)"
echo "GET $BASE_URL/users/1"
curl -s "$BASE_URL/users/1" | json_pp
echo ""

echo ""
echo "5. Create New User"
echo "POST $BASE_URL/users"
NEW_USER='{"name":"Test User","email":"test@example.com","age":25}'
curl -s -X POST "$BASE_URL/users" \
  -H "Content-Type: application/json" \
  -d "$NEW_USER" | json_pp
echo ""

echo ""
echo "6. Search Users by name (search: 'john')"
echo "GET $BASE_URL/users/search?name=john"
curl -s "$BASE_URL/users/search?name=john" | json_pp
echo ""

echo ""
echo "7. Update User (ID: 1)"
echo "PUT $BASE_URL/users/1"
UPDATED_USER='{"name":"John Updated","email":"john.updated@example.com","age":26}'
curl -s -X PUT "$BASE_URL/users/1" \
  -H "Content-Type: application/json" \
  -d "$UPDATED_USER" | json_pp
echo ""

echo ""
echo "8. Get Updated User (ID: 1)"
echo "GET $BASE_URL/users/1"
curl -s "$BASE_URL/users/1" | json_pp
echo ""

echo ""
echo "====================================="
echo "API Testing Complete!"
echo "====================================="