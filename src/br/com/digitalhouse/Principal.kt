package br.com.digitalhouse

fun main() {

    val DH = DigitalHouseManager()

    println("::..  CURSO  ..::")
    DH.registrarCurso("Full Stack", 20001, 3)
    DH.registrarCurso("Android", 20002, 2)


    println("\n::.. PROFESSORES  ..::")
    DH.registrarProfessorTitular("Pedro", "Pereira", 123, "Kotlin")
    DH.registrarProfessorTitular("Bernado", "Pedroso", 987,"HTML")
    DH.registrarProfessorAdjunto("Rafael", "Ferreira", 456, 55)
    DH.registrarProfessorAdjunto("Soraka", "Andrade", 654, 32)

    println("\n::..  ALUNOS  ..::")
    DH.registrarAluno("Gabriel", "Ramos", 10001)
    DH.registrarAluno("Bruno", "Ferreira", 10002)
    DH.registrarAluno("Emerson", "Araujo", 10003)
    DH.registrarAluno("João", "Bueno", 10004)
    DH.registrarAluno("Ricardo", "Pereira", 10005)

    println("\n::..  ALOCANDO PROFESSOR  ..::")
    DH.alocarProfessores(20001, 123,654)

    println("\n::..  MATRICULANDO ALUNO  ..::")
    DH.matricularAluno(10001, 20001)
    DH.matricularAluno(10002, 20001)
    DH.matricularAluno(10003, 20001)
    DH.matricularAluno(10004, 20002)
    DH.matricularAluno(10005, 20002)
    DH.matricularAluno(10005, 20002)

}


