#source "input3.txt"
	call main
	halt
	' * Record pair (offset 0)
	' * Array acme (offset 3)
	' * Array fibonacci (offset 3)
	p:
	' * Parameters
	' * Local Variables
	enter 0
	ret 0, 0, 0
	f:
	' * Parameters
	' * Real f (offset 0)
	' * Int f (offset 0)
	' * Local Variables
	' * Real real (offset -4)
	' * Char c (offset -5)
	' * Int result (offset -7)
	enter 7
#line 20
	push bp
	pushi -4
	addi
	push bp
	pushi -4
	addi
	loadf
	pushf 10.0
	mulf
	storef
#line 21
	push bp
	pushi -5
	addi
	pushb 48
	storeb
#line 22
	push bp
	pushi -8
	addi
	loadi
	pushi 256
	lti
	jz label0
#line 23
	push bp
	pushi -5
	addi
	i2b
	storeb
#line 24
	push bp
	pushi -7
	addi
	b2i
	storei
	jmp label1
	label0:
#line 27
	push bp
	pushi -7
	addi
	f2i
	storei
	label1:
#line 28
	push bp
	pushi -7
	addi
	loadi
	ret 2, 7, 6
	initialize:
	' * Parameters
	' * Local Variables
	' * Int i (offset -2)
	enter 2
#line 33
	pusha 3
	pushi 0
	pushi 0
	muli
	addi
	pushi 0
	pushi 2
	muli
	addi
	pushi 0
	storei
#line 34
	pusha 3
	pushi 0
	pushi 0
	muli
	addi
	pushi 1
	pushi 2
	muli
	addi
	pushi 1
	storei
#line 35
	pusha 3
	pushi 0
	pushi 0
	muli
	addi
	pushi 2
	pushi 2
	muli
	addi
	pushi 1
	storei
#line 36
	push bp
	pushi -2
	addi
	pushi 1
	storei
#line 37
	label2:
	push bp
	pushi -2
	addi
	loadi
	pushi 8
	lti
	jz label3
#line 38
	pusha 3
	push bp
	pushi -2
	addi
	loadi
	pushi 0
	muli
	addi
	pushi 0
	pushi 2
	muli
	addi
	pusha 3
	push bp
	pushi -2
	addi
	loadi
	pushi 1
	subi
	pushi 0
	muli
	addi
	pushi 1
	pushi 2
	muli
	addi
	loadi
	storei
#line 39
	pusha 3
	push bp
	pushi -2
	addi
	loadi
	pushi 0
	muli
	addi
	pushi 1
	pushi 2
	muli
	addi
	pusha 3
	push bp
	pushi -2
	addi
	loadi
	pushi 1
	subi
	pushi 0
	muli
	addi
	pushi 2
	pushi 2
	muli
	addi
	loadi
	storei
#line 40
	pusha 3
	push bp
	pushi -2
	addi
	loadi
	pushi 0
	muli
	addi
	pushi 2
	pushi 2
	muli
	addi
	pusha 3
	push bp
	pushi -2
	addi
	loadi
	pushi 0
	muli
	addi
	pushi 0
	pushi 2
	muli
	addi
	loadi
	pusha 3
	push bp
	pushi -2
	addi
	loadi
	pushi 0
	muli
	addi
	pushi 1
	pushi 2
	muli
	addi
	loadi
	addi
	storei
#line 41
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
	ret 0, 2, 0
	main:
	' * Parameters
	' * Local Variables
	' * Int i (offset -2)
	' * Int j (offset -4)
	enter 4
#line 49
	call p
	popnull
#line 50
	push bp
	pushi -2
	addi
	pushi 0
	storei
#line 51
	pusha 0
	pushi 2
	addi
	pushb 48
	storeb
#line 52
	pusha 0
	pushi 0
	addi
	b2i
	storei
#line 55
	i2f
	b2i
	call f
	outi
#line 55
	pushb 10
	outb
#line 56
	pushf 1.3
	pushi 2
	call f
#line 58
	call initialize
	popnull
#line 59
	push bp
	pushi -2
	addi
	pushi 0
	storei
#line 60
	label4:
	push bp
	pushi -2
	addi
	loadi
	pushi 8
	lti
	jz label5
#line 62
	pushb 40
	outb
#line 62
	push bp
	pushi -2
	addi
	loadi
	pushi 1
	addi
	outi
#line 62
	pushb 41
	outb
#line 62
	pusha 3
	push bp
	pushi -2
	addi
	loadi
	pushi 0
	muli
	addi
	pushi 0
	pushi 2
	muli
	addi
	loadi
	outi
#line 63
	pushb 43
	outb
#line 63
	pusha 3
	push bp
	pushi -2
	addi
	loadi
	pushi 0
	muli
	addi
	pushi 1
	pushi 2
	muli
	addi
	loadi
	outi
#line 63
	pushb 61
	outb
#line 64
	pusha 3
	push bp
	pushi -2
	addi
	loadi
	pushi 0
	muli
	addi
	pushi 2
	pushi 2
	muli
	addi
	loadi
	outi
#line 64
	pushb 10
	outb
#line 65
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
	jmp label4
	label5:
#line 68
	pusha 3
	pushi 1
	pushi 0
	muli
	addi
	pushi 3
	addi
	pushi 1
	pushi 2
	muli
	addi
	pushi 0
	addi
	pushi 56
	storei
#line 70
	pusha 3
	pushi 1
	pushi 0
	muli
	addi
	pushi 3
	addi
	pushi 1
	pushi 2
	muli
	addi
	pushi 0
	addi
	loadi
	outi
#line 70
	pushb 10
	outb
#line 71
	push bp
	pushi -2
	addi
	pushi 0
	storei
#line 72
	label6:
	push bp
	pushi -2
	addi
	loadi
	pushi 2
	lti
	jz label7
#line 73
	push bp
	pushi -4
	addi
	pushi 0
	storei
#line 74
	label8:
	push bp
	pushi -4
	addi
	loadi
	pushi 2
	lti
	jz label9
#line 75
	pusha 3
	push bp
	pushi -2
	addi
	loadi
	pushi 0
	muli
	addi
	pushi 3
	addi
	push bp
	pushi -4
	addi
	loadi
	pushi 2
	muli
	addi
	pushi 0
	addi
	push bp
	pushi -2
	addi
	loadi
	push bp
	pushi -4
	addi
	loadi
	addi
	storei
#line 76
	push bp
	pushi -4
	addi
	push bp
	pushi -4
	addi
	loadi
	pushi 1
	addi
	storei
	jmp label8
	label9:
#line 78
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
	jmp label6
	label7:
#line 82
	push bp
	pushi -2
	addi
	pushi 0
	storei
#line 83
	label10:
	push bp
	pushi -2
	addi
	loadi
	pushi 2
	lti
	jz label11
#line 84
	push bp
	pushi -4
	addi
	pushi 0
	storei
#line 85
	label12:
	push bp
	pushi -4
	addi
	loadi
	pushi 2
	lti
	jz label13
#line 87
	pusha 3
	push bp
	pushi -2
	addi
	loadi
	pushi 0
	muli
	addi
	pushi 3
	addi
	push bp
	pushi -4
	addi
	loadi
	pushi 2
	muli
	addi
	pushi 0
	addi
	loadi
	outi
#line 87
	pushb 32
	outb
#line 88
	push bp
	pushi -4
	addi
	push bp
	pushi -4
	addi
	loadi
	pushi 1
	addi
	storei
	jmp label12
	label13:
#line 90
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
	jmp label10
	label11:
	ret 0, 4, 0
