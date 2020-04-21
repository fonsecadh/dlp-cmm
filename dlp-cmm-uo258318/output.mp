#source "input.txt"
	call main
	halt
	' * Int i (offset 0)
	' * Int n (offset 2)
	' * Char c (offset 4)
	' * Record record (offset 5)
	f:
	' * Parameters
	' * Int f(offset 0)
	' * Real f(offset 0)
	' * Local Variables
	' * Real real (offset -4)
	enter 4
	main:
	' * Parameters
	' * Local Variables
	' * Int i (offset -2)
	' * Real r (offset -6)
	enter 6
	ret 0, 6, 0
