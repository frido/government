package frido.samosprava;

import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.List;

public interface Store {

    public ObjectNode getById(int id);

    public List<ObjectNode> getAll();
}
