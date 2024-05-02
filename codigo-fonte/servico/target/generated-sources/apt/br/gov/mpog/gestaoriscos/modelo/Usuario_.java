package br.gov.mpog.gestaoriscos.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ {

	public static volatile SingularAttribute<Usuario, Boolean> excluido;
	public static volatile ListAttribute<Usuario, Permissao> permissoes;
	public static volatile SingularAttribute<Usuario, Orgao> orgao;
	public static volatile SingularAttribute<Usuario, String> cpf;
	public static volatile SingularAttribute<Usuario, String> nome;
	public static volatile SingularAttribute<Usuario, Long> id;
	public static volatile SingularAttribute<Usuario, String> email;

}

