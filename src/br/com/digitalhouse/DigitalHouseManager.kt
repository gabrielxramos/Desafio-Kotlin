package br.com.digitalhouse

class DigitalHouseManager() {

    val listaDeAlunos = mutableListOf<Aluno>()
    val listaDeProfessores = mutableListOf<Professor>()
    val listaDeCurso = mutableListOf<Curso>()
    val listaDeMatricula = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        val adicionarCurso = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)
        if (listaDeCurso.add(adicionarCurso)) {
            println("O curso ${adicionarCurso.nome} Foi adicionado com sucesso")
        } else {
            println("O curso com o código informado já existe")
        }
    }

    fun excluirCurso(codigoCurso: Int) {
        for (curso in listaDeCurso) {
            if (curso.codCurso == codigoCurso) {
                listaDeCurso.remove(curso)
                println("Curso com o código ${codigoCurso}, foi removido com sucesso")
            }
        }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        val registrarAdjunto = ProfessorAdj(0, nome, sobrenome, quantidadeDeHoras, codigoProfessor)
        if (listaDeProfessores.add(registrarAdjunto)) {
            println("O Professor Adjunto ${registrarAdjunto.nome}, foi cadastrado com sucesso!")
        } else {
            println("O Professor com o código informado já existe")
        }
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        val registrarProfTitular = ProfessorTitular(especialidade, nome, sobrenome, 0, codigoProfessor)
        if (listaDeProfessores.contains(registrarProfTitular)) {
            println("O Professor com o código informado já existe")
        } else {
            listaDeProfessores.add(registrarProfTitular)
            println("O Professor ${registrarProfTitular.nome}, foi cadastrado com sucesso!")
        }
    }

    fun excluirProfessor(codigoProfessor: Int) {
        for (removeProf in listaDeProfessores) {
            if (removeProf.codProfessor == codigoProfessor) {
                listaDeProfessores.remove(removeProf)
            }
        }
    }

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        val adicionaAluno = Aluno(nome, sobrenome, codigoAluno)
        if (listaDeAlunos.add(adicionaAluno)) {
            println("O aluno ${adicionaAluno.nome} foi cadastrado com sucesso!")
        } else {
            println("O aluno com o código informado já existe")
        }
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        var aluno1 = Aluno(codAluno = codigoAluno)
        var curso1 = Curso(codCurso = codigoCurso)

        for (curso in listaDeCurso) {
            if (curso.codCurso == codigoCurso) {
                curso1 = curso
            }
        }

        for (aluno in listaDeAlunos) {
            if (aluno.codAluno == codigoAluno) {
                aluno1 = aluno
            }
        }

        if (curso1.adicionarUmAluno(aluno1)) {
            val matricula1 = Matricula(aluno1, curso1, "21/10/2542")
            listaDeMatricula.add(matricula1)
            println("Matricula do aluno: ${aluno1.nome} no curso de ${curso1.nome} foi realizada com sucesso!")
        }else{
            println("Não há vagas dispovíveis no momento. Sua matrícula não pôde ser efetuada. ")
        }
    }

        fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {

            var cursoEncontrado: Curso? = null
            var professorTitularEncontrado: ProfessorTitular? = null
            var professorAdjuntoEncontrado: ProfessorAdj? = null

            for (curso in listaDeCurso) {
                if (codigoCurso == curso.codCurso) {
                    cursoEncontrado = curso
                }
            }

            for (professor in listaDeProfessores) {
                if (codigoProfessorTitular == professor.codProfessor && professor is ProfessorTitular) {
                    professorTitularEncontrado = professor
                }
            }

            for (professor in listaDeProfessores) {
                if (codigoProfessorAdjunto == professor.codProfessor && professor is ProfessorAdj) {
                    professorAdjuntoEncontrado = professor
                }
            }

            if (cursoEncontrado != null) {

                if (professorTitularEncontrado != null) {
                    cursoEncontrado.profeTitular = professorTitularEncontrado
                    println("Professor titular ${professorTitularEncontrado.nome} cadastrado no curso de ${cursoEncontrado.nome}")
                }

                if (professorAdjuntoEncontrado != null) {
                    cursoEncontrado.profeAdjunto = professorAdjuntoEncontrado
                    println("Professor adjunto ${professorAdjuntoEncontrado.nome} cadastrado no curso de ${cursoEncontrado.nome}")
                }
            }
        }
    }


/*
        for (professor in listaDeProfessores) {
            if (professor.codProfessor == codigoProfessorTitular) {
                for (curso in listaDeCurso) {
                    if (curso.codCurso == codigoCurso) {
                        curso.profeTitular == professor
                        println("O professor ${professor.nome} ${professor.sobreNome} foi adicionado ao curso ${curso.nome}")
                    }
                }
                if (professor.codProfessor == codigoProfessorAdjunto) {
                    for (curso in listaDeCurso) {
                        if (curso.codCurso == codigoCurso) {
                            curso.profeAdjunto == professor
                            println("O professor adjunto ${professor.nome} ${professor.sobreNome} foi adicionado ao curso ${curso.nome}")
                        }
                    }
                }
            }
        }

    }

*/