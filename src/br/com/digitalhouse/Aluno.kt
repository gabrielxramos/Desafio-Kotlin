package br.com.digitalhouse

data class Aluno(val nome: String, val sobreNome: String, val codAluno: Int) {



    override fun equals(other: Any?): Boolean {
        return if (other is Aluno) {
            other.codAluno == codAluno
        } else {
            true
        }
    }

}