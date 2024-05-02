package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Permissao;

import br.gov.mpog.gestaoriscos.modelo.Usuario;

import br.gov.mpog.gestaoriscos.modelo.dto.PermissaoDTO;

import br.gov.mpog.gestaoriscos.modelo.dto.UsuarioDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:22-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class UsuarioMapperImpl implements UsuarioMapper {

    @Autowired

    private OrgaoMapper orgaoMapper;

    @Autowired

    private PermissaoMapper permissaoMapper;

    @Override

    public UsuarioDTO usuarioToUsuarioDTO(Usuario usuario) {

        if ( usuario == null ) {

            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setId( usuario.getId() );

        usuarioDTO.setNome( usuario.getNome() );

        usuarioDTO.setCpf( usuario.getCpf() );

        usuarioDTO.setEmail( usuario.getEmail() );

        List<PermissaoDTO> list = permissaoMapper.permissaosToPermissaoDTOs( usuario.getPermissoes() );

        if ( list != null ) {

            usuarioDTO.setPermissoes( list );
        }

        return usuarioDTO;
    }

    @Override

    public List<UsuarioDTO> usuariosToUsuarioDTOs(List<Usuario> usuarios) {

        if ( usuarios == null ) {

            return null;
        }

        List<UsuarioDTO> list = new ArrayList<UsuarioDTO>();

        for ( Usuario usuario : usuarios ) {

            list.add( usuarioToUsuarioDTO( usuario ) );
        }

        return list;
    }

    @Override

    public Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO) {

        if ( usuarioDTO == null ) {

            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setId( usuarioDTO.getId() );

        usuario.setNome( usuarioDTO.getNome() );

        usuario.setCpf( usuarioDTO.getCpf() );

        usuario.setOrgao( orgaoMapper.orgaoDTOToOrgao( usuarioDTO.getOrgao() ) );

        usuario.setEmail( usuarioDTO.getEmail() );

        List<Permissao> list = permissaoMapper.permissaoDTOsToPermissaos( usuarioDTO.getPermissoes() );

        if ( list != null ) {

            usuario.setPermissoes( list );
        }

        return usuario;
    }

    @Override

    public List<Usuario> usuarioDTOsToUsuarios(List<UsuarioDTO> usuarioDTOs) {

        if ( usuarioDTOs == null ) {

            return null;
        }

        List<Usuario> list = new ArrayList<Usuario>();

        for ( UsuarioDTO usuarioDTO : usuarioDTOs ) {

            list.add( usuarioDTOToUsuario( usuarioDTO ) );
        }

        return list;
    }
}

