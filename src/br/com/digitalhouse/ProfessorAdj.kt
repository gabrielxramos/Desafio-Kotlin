package br.com.digitalhouse

class ProfessorAdj(
        val horasMentoria: Int,
        override val nome: String,
        override val sobreNome: String,
        override var tempo: Int,
        override val codProfessor: Int):Professor {

}