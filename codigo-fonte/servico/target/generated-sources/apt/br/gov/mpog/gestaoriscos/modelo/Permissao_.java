package br.gov.mpog.gestaoriscos.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Permissao.class)
public abstract class Permissao_ {

	public static volatile SingularAttribute<Permissao, Boolean> excluido;
	public static volatile SingularAttribute<Permissao, Date> dtCadastro;
	public static volatile SingularAttribute<Permissao, Usuario> usuario;
	public static volatile SingularAttribute<Permissao, Long> id;
	public static volatile SingularAttribute<Permissao, Perfil> perfil;

}

