#source "input2.txt"
	call main
	halt
	' * Int i (offset 0)
	' * Int n (offset 2)
	' * Int j (offset 4)
	' * Char c (offset 6)
	' * Record pair (offset 7)
	' * Array matrix (offset 10)
#line 12
	p:
	' * Parameters
	' * Local Variables
	enter 0
	ret 0, 0, 0
#line 14
	f:
	' * Parameters
	' * Real r (offset -4)
	' * Int e (offset -8)
	' * Local Variables
	' * Real real (offset -4)
	' * Char c (offset -5)
	enter 5
#line 17
	' * Assignment
	push bp
	pushi -4
	addi
	pusha 7
	pushi 2
	addi
	loadb
	b2i
	i2f
	pusha 7
	pushi 0
	addi
	loadi
	i2f
	addf
	push bp
	pushi -4
	addi
	loadf
	addf
	push bp
	pushi -8
	addi
	loadi
	i2f
	addf
	storef
#line 18
	' * Assignment
	push bp
	pushi -5
	addi
	pushb 48
	storeb
#line 19
	' * Return Statement
	push bp
	pushi -5
	addi
	loadb
	b2i
	ret 2, 5, 6
#line 24
	fill:
	' * Parameters
	' * Int row (offset -4)
	' * Int value (offset -6)
	' * Int increment (offset -8)
	' * Local Variables
	' * Int i (offset -2)
	' * Int inc (offset -4)
	enter 4
#line 26
	' * Assignment
	push bp
	pushi -2
	addi
	pushi 0
	storei
#line 27
	' * Assignment
	push bp
	pushi -4
	addi
	push bp
	pushi -8
	addi
	loadi
	storei
#line 28
	' * While Statement
	label0:
	push bp
	pushi -2
	addi
	loadi
	pushi 10
	lti
	jz label1
#line 29
	' * Assignment
	pusha 10
	push bp
	pushi -4
	addi
	loadi
	pushi 0
	muli
	addi
	push bp
	pushi -2
	addi
	loadi
	pushi 2
	muli
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
#line 30
	' * Assignment
	push bp
	pushi -2
	addi
	push bp
	pushi -2
	addi
	loadi
	pushi 1
	addi
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
	pushi -8
	addi
	loadi
	addi
	storei
	jmp label0
	label1:
	ret 0, 4, 6
#line 35
	show:
	' * Parameters
	' * Int row (offset -4)
	' * Local Variables
	' * Int i (offset -2)
	enter 2
#line 37
	' * Assignment
	push bp
	pushi -2
	addi
	pushi 0
	storei
#line 38
	' * While Statement
	label2:
	push bp
	pushi -2
	addi
	loadi
	pushi 10
	lti
	jz label3
#line 39
	' * Write Statement
	pushb 40
	outb
#line 39
	' * Write Statement
	push bp
	pushi -4
	addi
	loadi
	outi
#line 39
	' * Write Statement
	pushb 44
	outb
#line 39
	' * Write Statement
	push bp
	pushi -2
	addi
	loadi
	outi
#line 39
	' * Write Statement
	pushb 41
	outb
#line 39
	' * Write Statement
	pushb 58
	outb
#line 39
	' * Write Statement
	pusha 10
	push bp
	pushi -4
	addi
	loadi
	pushi 0
	muli
	addi
	push bp
	pushi -2
	addi
	loadi
	pushi 2
	muli
	addi
	loadi
	outi
#line 39
	' * Write Statement
	pushb 32
	outb
#line 40
	' * Assignment
	push bp
	pushi -2
	addi
	push bp
	pushi -2
	addi
	loadi
	pushi 1
	addi
	storei
	jmp label2
	label3:
#line 42
	' * Write Statement
	pushb 10
	outb
	ret 0, 2, 2
#line 47
	main:
	' * Parameters
	' * Local Variables
	' * Int i (offset -2)
	enter 2
#line 50
	' * Invocation Statement
	call p
#line 51
	' * Assignment
	push bp
	pushi -2
	addi
	pushi 0
	storei
#line 52
	' * Assignment
	pusha 7
	pushi 2
	addi
	pushb 48
	storeb
#line 53
	' * Assignment
	pusha 7
	pushi 0
	addi
	pushb 48
	b2i
	storei
#line 54
	' * Write Statement
	push bp
	pushi -2
	addi
	loadi
	i2f
	pusha 7
	pushi 2
	addi
	loadb
	b2i
	call f
	outi
#line 54
	' * Write Statement
	pushb 10
	outb
#line 56
	' * Invocation Statement
	pushf 1.3
	pushi 2
	call f
	popi
#line 58
	' * Assignment
	push bp
	pushi -2
	addi
	pushi 0
	storei
#line 59
	' * Assignment
	pusha 4
	pushi 0
	storei
#line 60
	' * While Statement
	label4:
	push bp
	pushi -2
	addi
	loadi
	pushi 10
	lti
	jz label5
#line 62
	' * Invocation Statement
	push bp
	pushi -2
	addi
	loadi
	call show
#line 63
	' * Assignment
	push bp
	pushi -2
	addi
	push bp
	pushi -2
	addi
	loadi
	pushi 1
	addi
	storei
#line 64
	' * Assignment
	pusha 4
	push bp
	pushi -2
	addi
	loadi
	pushi 10
	muli
	storei
	jmp label4
	label5:
	ret 0, 2, 0
