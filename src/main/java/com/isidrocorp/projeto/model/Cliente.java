package com.isidrocorp.projeto.model;
import javax.persistence.*;


@Entity
@Table(name="tbcliente")
public class Cliente {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="codcliente")
		private int codigo;
		
		@Column(name="nome")
		private String nome;
		
		@Column(name="cpf")
		private String cpf;
		
		@Column(name="email")
		private String email;
		
		@Column(name="telefone")
		private String telefone;

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
		
		
		
		
		
		
}
