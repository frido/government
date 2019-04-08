package frido.samosprava;

import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.List;

public interface Store {

    public List<ObjectNode> getAll();
}
