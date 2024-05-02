package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Orgao;

import br.gov.mpog.gestaoriscos.modelo.Usuario;

import br.gov.mpog.gestaoriscos.modelo.dto.OrgaoDTO;

import br.gov.mpog.gestaoriscos.modelo.dto.UsuarioDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:21-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class OrgaoMapperImpl implements OrgaoMapper {

    @Autowired

    private CategoriaUnidadeMapper categoriaUnidadeMapper;

    @Autowired

    private NaturezaJuridicaMapper naturezaJuridicaMapper;

    @Autowired

    private UsuarioMapper usuarioMapper;

    @Override

    public OrgaoDTO orgaoToOrgaoDTO(Orgao orgao) {

        if ( orgao == null ) {

            return null;
        }

        OrgaoDTO orgaoDTO = new OrgaoDTO();

        orgaoDTO.setId( orgao.getId() );

        orgaoDTO.setNome( orgao.getNome() );

        orgaoDTO.setSigla( orgao.getSigla() );

        List<UsuarioDTO> list = usuarioMapper.usuariosToUsuarioDTOs( orgao.getUsuarios() );

        if ( list != null ) {

            orgaoDTO.setUsuarios( list );
        }

        orgaoDTO.setCategoriaUnidade( categoriaUnidadeMapper.categoriaUnidadeToCategoriaUnidadeDTO( orgao.getCategoriaUnidade() ) );

        orgaoDTO.setNaturezaJuridica( naturezaJuridicaMapper.naturezaJuridicaToNaturezaJuridicaDTO( orgao.getNaturezaJuridica() ) );

        orgaoDTO.setIdCategoriaUnidade( orgao.getIdCategoriaUnidade() );

        orgaoDTO.setIdNaturezaJuridica( orgao.getIdNaturezaJuridica() );

        return orgaoDTO;
    }

    @Override

    public List<OrgaoDTO> orgaosToOrgaoDTOs(List<Orgao> orgaos) {

        if ( orgaos == null ) {

            return null;
        }

        List<OrgaoDTO> list = new ArrayList<OrgaoDTO>();

        for ( Orgao orgao : orgaos ) {

            list.add( orgaoToOrgaoDTO( orgao ) );
        }

        return list;
    }

    @Override

    public Orgao orgaoDTOToOrgao(OrgaoDTO orgaoDTO) {

        if ( orgaoDTO == null ) {

            return null;
        }

        Orgao orgao = new Orgao();

        orgao.setId( orgaoDTO.getId() );

        orgao.setNome( orgaoDTO.getNome() );

        orgao.setSigla( orgaoDTO.getSigla() );

        orgao.setCategoriaUnidade( categoriaUnidadeMapper.categoriaUnidadeDTOToCategoriaUnidade( orgaoDTO.getCategoriaUnidade() ) );

        orgao.setNaturezaJuridica( naturezaJuridicaMapper.naturezaJuridicaDTOToNaturezaJuridica( orgaoDTO.getNaturezaJuridica() ) );

        orgao.setOrgaoPai( orgaoDTOToOrgao( orgaoDTO.getOrgaoPai() ) );

        List<Orgao> list = orgaoDTOsToOrgaos( orgaoDTO.getOrgaosFilhos() );

        if ( list != null ) {

            orgao.setOrgaosFilhos( list );
        }

        List<Usuario> list_ = usuarioMapper.usuarioDTOsToUsuarios( orgaoDTO.getUsuarios() );

        if ( list_ != null ) {

            orgao.setUsuarios( list_ );
        }

        orgao.setIdCategoriaUnidade( orgaoDTO.getIdCategoriaUnidade() );

        orgao.setIdNaturezaJuridica( orgaoDTO.getIdNaturezaJuridica() );

        return orgao;
    }

    @Override

    public List<Orgao> orgaoDTOsToOrgaos(List<OrgaoDTO> orgaoDTOs) {

        if ( orgaoDTOs == null ) {

            return null;
        }

        List<Orgao> list_ = new ArrayList<Orgao>();

        for ( OrgaoDTO orgaoDTO : orgaoDTOs ) {

            list_.add( orgaoDTOToOrgao( orgaoDTO ) );
        }

        return list_;
    }
}

