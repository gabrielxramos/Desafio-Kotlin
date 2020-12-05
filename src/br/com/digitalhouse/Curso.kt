package br.com.digitalhouse

data class Curso(
        val nome: String,
        val codCurso: Int,
        val quantidadeMaxAln: Int) {

    val listaDeMatriculados = mutableListOf<Aluno>()
    var profeTitular: ProfessorTitular? = null
    var profeAdjunto: ProfessorAdj? = null

    override fun equals(other: Any?): Boolean {
        return if (other is Curso) {
            other.codCurso == codCurso
        } else {
            true
        }
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        for (aluno in listaDeMatriculados)
            listaDeMatriculados.add(umAluno)
        return true or return false
    }

    fun excluirAluno(umAluno: Aluno){
        listaDeMatriculados.remove(umAluno)
    }

}