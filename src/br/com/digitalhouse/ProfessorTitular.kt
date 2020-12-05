package br.com.digitalhouse

class ProfessorTitular(
        val Especialidade: String,
        override val nome: String,
        override val sobreNome: String,
        override var tempo: Int,
        override val codProfessor: Int) :Professor {
}