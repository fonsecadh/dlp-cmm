#source "input1.txt"
	call main
	halt
	' * Array v (offset 0)
	main:
	' * Parameters
	' * Local Variables
	' * Real value (offset -4)
	' * Int i (offset -6)
	' * Int j (offset -8)
	' * Array w (offset -8)
	' * Record date (offset -14)
	enter 14
#line 13
	' * Read Statement
	push bp
	pushi -14
	addi
	pushi 0
	addi
	ini
	storei
#line 14
	' * Assignment
	push bp
	pushi -14
	addi
	pushi 4
	addi
	b2i
	storei
#line 15
	' * Assignment
	push bp
	pushi -14
	addi
	pushi 2
	addi
	push bp
	pushi -14
	addi
	pushi 0
	addi
	loadi
	push bp
	pushi -14
	addi
	pushi 4
	addi
	loadi
	muli
	pushi 12
	modi
	pushi 1
	addi
	storei
#line 16
	' * Write Statement
	push bp
	pushi -14
	addi
	pushi 0
	addi
	loadi
	outi
#line 16
	' * Write Statement
	pushb 10
	outb
#line 16
	' * Write Statement
	push bp
	pushi -14
	addi
	pushi 2
	addi
	loadi
	outi
#line 16
	' * Write Statement
	pushb 10
	outb
#line 16
	' * Write Statement
	i2f
	outf
#line 16
	' * Write Statement
	pushb 10
	outb
#line 18
	' * Read Statement
	push bp
	pushi -4
	addi
	inf
	storef
#line 20
	' * Assignment
	push bp
	pushi -6
	addi
	pushi 0
	storei
#line 21
	' * While Statement
	label0:
	push bp
	pushi -6
	addi
	loadi
	pushi 10
	lti
	jz label1
#line 22
	' * Assignment
	pusha 0
	push bp
	pushi -6
	addi
	loadi
	pushi 4
	muli
	addi
	push bp
	pushi -4
	addi
	loadf
	storef
#line 23
	' * Write Statement
	push bp
	pushi -6
	addi
	loadi
	outi
#line 23
	' * Write Statement
	pushb 58
	outb
#line 23
	' * Write Statement
	pusha 0
	push bp
	pushi -6
	addi
	loadi
	pushi 4
	muli
	addi
	loadf
	outf
#line 23
	' * Write Statement
	pushb 32
	outb
#line 24
	' * If Statement
	push bp
	pushi -6
	addi
	loadi
	pushi 2
	modi
	jz label2
#line 25
	' * Write Statement
	pushb 111
	outb
#line 25
	' * Write Statement
	pushb 100
	outb
#line 25
	' * Write Statement
	pushb 100
	outb
#line 25
	' * Write Statement
	pushb 10
	outb
	jmp label3
	label2:
#line 27
	' * Write Statement
	pushb 101
	outb
#line 27
	' * Write Statement
	pushb 118
	outb
#line 27
	' * Write Statement
	pushb 101
	outb
#line 27
	' * Write Statement
	pushb 110
	outb
#line 27
	' * Write Statement
	pushb 10
	outb
	label3:
#line 28
	' * Assignment
	push bp
	pushi -6
	addi
	push bp
	pushi -6
	addi
	loadi
	pushi 1
	addi
	storei
	jmp label0
	label1:
#line 30
	' * Write Statement
	pushb 10
	outb
#line 32
	' * Assignment
	push bp
	pushi -6
	addi
	pushi 0
	storei
#line 33
	' * While Statement
	label4:
	push bp
	pushi -6
	addi
	loadi
	pushi 4
	lti
	jz label5
#line 34
	' * Assignment
	push bp
	pushi -8
	addi
	pushi 0
	storei
#line 35
	' * While Statement
	label6:
	push bp
	pushi -8
	addi
	loadi
	pushi 5
	lti
	jz label7
#line 36
	' * Assignment
	push bp
	pushi -8
	addi
	push bp
	pushi -6
	addi
	loadi
	pushi 0
	muli
	addi
	push bp
	pushi -8
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
	pushi -8
	addi
	loadi
	addi
	storei
#line 37
	' * Write Statement
	push bp
	pushi -8
	addi
	push bp
	pushi -6
	addi
	loadi
	pushi 0
	muli
	addi
	push bp
	pushi -8
	addi
	loadi
	pushi 2
	muli
	addi
	loadi
	outi
#line 37
	' * Write Statement
	pushb 32
	outb
#line 38
	' * Assignment
	push bp
	pushi -8
	addi
	push bp
	pushi -8
	addi
	loadi
	pushi 1
	addi
	storei
	jmp label6
	label7:
#line 40
	' * Write Statement
	pushb 10
	outb
#line 41
	' * Assignment
	push bp
	pushi -6
	addi
	push bp
	pushi -6
	addi
	loadi
	pushi 1
	addi
	storei
	jmp label4
	label5:
	ret 0, 14, 0
