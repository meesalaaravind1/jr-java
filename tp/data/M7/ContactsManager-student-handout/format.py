def format(s):
	if "Great!!! All test cases passed" in s:
		print("All testcases passed")
	elif "Some of the test cases failed" in s:
		s = s.split(" ")
		output = "Testcases "
		tem = -1
		for i in range(len(s)):
			if s[i] == "Case":
				output += str(s[i+2]) + " " 
			if s[i] == "Cases":
				temp = i
		output += "are failed. "+ s[temp-4]+"/"+s[temp-2]+" testcases passed"
		print(output)

format(input())