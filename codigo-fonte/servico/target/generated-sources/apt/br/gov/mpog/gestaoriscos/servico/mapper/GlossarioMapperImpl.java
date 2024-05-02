package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Glossario;

import br.gov.mpog.gestaoriscos.modelo.dto.GlossarioDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:21-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class GlossarioMapperImpl implements GlossarioMapper {

    @Override

    public GlossarioDTO glossarioToGlossarioDTO(Glossario glossario) {

        if ( glossario == null ) {

            return null;
        }

        GlossarioDTO glossarioDTO = new GlossarioDTO();

        glossarioDTO.setExcluido( glossario.isExcluido() );

        glossarioDTO.setDescricao( glossario.getDescricao() );

        glossarioDTO.setStatus( glossario.isStatus() );

        glossarioDTO.setTermo( glossario.getTermo() );

        glossarioDTO.setTermoSearch( glossario.getTermoSearch() );

        glossarioDTO.setDescricaoSearch( glossario.getDescricaoSearch() );

        glossarioDTO.setId( glossario.getId() );

        return glossarioDTO;
    }

    @Override

    public List<GlossarioDTO> glossariosToGlossarioDTOs(List<Glossario> glossarios) {

        if ( glossarios == null ) {

            return null;
        }

        List<GlossarioDTO> list = new ArrayList<GlossarioDTO>();

        for ( Glossario glossario : glossarios ) {

            list.add( glossarioToGlossarioDTO( glossario ) );
        }

        return list;
    }

    @Override

    public Glossario glossarioDTOToGlossario(GlossarioDTO glossarioDTO) {

        if ( glossarioDTO == null ) {

            return null;
        }

        Glossario glossario = new Glossario();

        glossario.setExcluido( glossarioDTO.isExcluido() );

        glossario.setDescricao( glossarioDTO.getDescricao() );

        glossario.setStatus( glossarioDTO.isStatus() );

        glossario.setTermo( glossarioDTO.getTermo() );

        glossario.setTermoSearch( glossarioDTO.getTermoSearch() );

        glossario.setDescricaoSearch( glossarioDTO.getDescricaoSearch() );

        glossario.setId( glossarioDTO.getId() );

        return glossario;
    }

    @Override

    public List<Glossario> glossarioDTOsToGlossarios(List<GlossarioDTO> glossarioDTOs) {

        if ( glossarioDTOs == null ) {

            return null;
        }

        List<Glossario> list = new ArrayList<Glossario>();

        for ( GlossarioDTO glossarioDTO : glossarioDTOs ) {

            list.add( glossarioDTOToGlossario( glossarioDTO ) );
        }

        return list;
    }
}

