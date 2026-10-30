import com.leidy.trabajo.Dto.UsuarioDto;
import dao.UsuariosDao;
import dto.HerramientaDto;

import java.util.ArrayList;

public class UsuariosService implements IHerramientasService {

    private HerramientasDao dao;

    public UsuariosService() {
        this.dao = new HerramientasDao();
    }

    @Override
    public ArrayList<HerramientaDto> listar() {
        return this.dao.leerTodos();
    }

    @Override
    public ArrayList<HerramientaDto> listarPorNombre(String nombre) {
        ArrayList<HerramientaDto> herramientas = this.dao.leerTodos();
        ArrayList<HerramientaDto> encontrados = new ArrayList<>();
        for (HerramientaDto herr : herramientas) {
            // name = martillo
            // name = alicate
            // name = rodillo
            // 'llo'
            if (herr.getName().contains(nombre)) {
                encontrados.add(herr);
            }
        }
        return encontrados;
    }

    @Override
    public void crear(HerramientaDto herramientaDto) {
        ArrayList<HerramientaDto> herramientas = this.dao.leerTodos();
        herramientas.add(herramientaDto);
        this.dao.guardarTodos(herramientas);
    }

    @Override
    public void eliminar(Long id) {
        ArrayList<HerramientaDto> herramientas = this.dao.leerTodos();
        for (HerramientaDto herr: herramientas) {
            if (herr.getId().equals(id)) {
                herramientas.remove(herr);
            }
        }
        this.dao.guardarTodos(herramientas);
    }

    @Override
    public void eliminar(HerramientaDto herramientaDto) {
        ArrayList<HerramientaDto> herramientas = this.dao.leerTodos();
        herramientas.remove(herramientaDto);
        this.dao.guardarTodos(herramientas);
    }

    @Override
    public void actualizar(Long id, HerramientaDto herramientaDto) {
        ArrayList<HerramientaDto> herramientas = this.dao.leerTodos();
        for (HerramientaDto herr: herramientas) {
            if (herr.getId().equals(id)) {
                herr.setName(herramientaDto.getName());
            }
        }
        java.lang.Object usuarios;
        this.dao.guardarTodos(usuarios);
    }

    @Override
    public void actualizar(UsuarioDto UsuarioDto) {
        ArrayList<UsuarioDto> usuarios = this.dao.leerTodos();
        for (UsuarioDto herr: usuarios) {
            if (herr.getId().equals(UsuarioDto.getId())) {
                herr.setName(UsuarioDto.getName());
            }
        }
        this.dao.guardarTodos(usuarios);
    }

    @Override
    public UsuarioDto getPorId(long id) {
        ArrayList<UsuarioDto> usuarios = this.dao.leerTodos();
       UsuarioDto encontrado = null;
        for (UsuarioDto herr: usuarios) {
            if (herr.getId().equals(id)) {
                encontrado = herr;
            }
        }
        return encontrado;
    }
}
 