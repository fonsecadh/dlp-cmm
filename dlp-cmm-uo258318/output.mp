#source "input2-lab13.txt"
	call main
	halt
	' * Char myChar (offset 0)
#line 15
	right:
	' * Parameters
	' * Char charp (offset 10)
	' * Int intp (offset 8)
	' * Real doublep (offset 4)
	' * Local Variables
	' * Int myInt (offset -2)
	' * Int x (offset -4)
	' * Int y (offset -6)
	' * Real myDouble (offset -10)
	' * Array charArray (offset -10)
	' * Record record (offset -14)
	enter 14
#line 21
	' * Assignment
	pusha 0
	push bp
	pushi 10
	addi
	loadb
	storeb
#line 21
	' * Assignment
	push bp
	pushi -2
	addi
	push bp
	pushi 8
	addi
	loadi
	storei
#line 21
	' * Assignment
	push bp
	pushi -10
	addi
	push bp
	pushi 4
	addi
	loadf
	storef
#line 22
	' * Write Statement
	pusha 0
	loadb
	outb
#line 22
	' * Write Statement
	push bp
	pushi -2
	addi
	loadi
	outi
#line 22
	' * Write Statement
	push bp
	pushi -10
	addi
	loadf
	outf
#line 24
	' * Assignment
	push bp
	pushi -10
	addi
	pushi 0
	pushi 1
	muli
	addi
	pushb 98
	storeb
#line 24
	' * Assignment
	push bp
	pushi -2
	addi
	pushi 2
	storei
#line 24
	' * Assignment
	push bp
	pushi -14
	addi
	pushi 0
	addi
	pushf 0
	pushf 1.1
	subf
	storef
#line 25
	' * Write Statement
	push bp
	pushi -10
	addi
	pushi 0
	pushi 1
	muli
	addi
	loadb
	outb
#line 25
	' * Write Statement
	push bp
	pushi -2
	addi
	loadi
	outi
#line 25
	' * Write Statement
	push bp
	pushi -14
	addi
	pushi 0
	addi
	loadf
	outf
#line 27
	' * Assignment
	pusha 0
	pushb 97
	storeb
#line 27
	' * Assignment
	push bp
	pushi -2
	addi
	pushb 97
	storei
#line 27
	' * Assignment
	push bp
	pushi -10
	addi
	pushb 97
	storef
#line 28
	' * Write Statement
	pusha 0
	loadb
	outb
#line 28
	' * Write Statement
	push bp
	pushi -2
	addi
	loadi
	outi
#line 28
	' * Write Statement
	push bp
	pushi -10
	addi
	loadf
	outf
#line 30
	' * Assignment
	push bp
	pushi -4
	addi
	pushi 1
	storei
#line 30
	' * Assignment
	push bp
	pushi -6
	addi
	pushi 2
	storei
#line 31
	' * Assignment
	push bp
	pushi -4
	addi
	push bp
	pushi -4
	addi
	loadi
	push bp
	pushi -6
	addi
	loadi
	addi
	storei
#line 31
	' * Assignment
	push bp
	pushi -6
	addi
	push bp
	pushi -6
	addi
	loadi
	push bp
	pushi -4
	addi
	loadi
	addi
	storei
#line 32
	' * Write Statement
	push bp
	pushi -4
	addi
	loadi
	outi
#line 32
	' * Write Statement
	push bp
	pushi -6
	addi
	loadi
	outi
	ret 0, 14, 7
#line 56
	main:
	' * Parameters
	' * Local Variables
	enter 0
#line 57
	' * Invocation Statement
	pushb 97
	pushi 32
	pushf 0
	pushf 3.4
	subf
	call right
#line 58
	' * Write Statement
	pushb 10
	outb
	ret 0, 0, 0
