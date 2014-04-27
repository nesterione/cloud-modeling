package org.gstu.cloudModelingApp;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("mesh")
public class Mesh {

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getMesh() {
        String jsonMeshModel="{ \"metadata\": { \"formatVersion\" : 3 }, "
           +" \"materials\": [	{"
           +" \"DbgColor\" : 15658734,"
        	+" \"DbgIndex\" : 0,"
        	+" \"DbgName\" : \"default\","
        	+" \"vertexColors\" : true"
        	+" }],"
            +" \"vertices\": [0,0,0,  1,0,0,  1,1,0,   0,1,0,   0,0,0.5,  1,0,0.5,   1,1,0.5,  0,1,0.5,     " 
                        +"  0,1,0,  1,1,0,  1,2,0,   0,2,0,   0,1,0.5,  1,1,0.5,   1,2,0.5,  0,2,0.5],"
            +" \"normals\":  [],"
            +" \"colors\":   [16711680,65280,255,  456456,43454,23123,  456,54645 ],"
            +" \"uvs\":      [ [ 0,0, 0,1, 1,0, 1,1 ]],"

            +" \"faces\": [128, 0,3,1, 0,3,1,   128, 3,2,1, 3,2,1,    128, 0,4,7,0,4,7,    128, 0,7,3,0,7,3,     128,5,7,4,5,7,4,     128,5,6,7,5,6,7,     128,1,6,5,1,6,5,    128,1,2,6,1,2,6,    128,2,7,6,2,7,6,     128,2,3,7,2,3,7,     128,1,5,4,1,5,4,    128,1,4,0,1,4,0,   "                            
                      +" 128, 8,11,9, 0,3,1,  128, 11,10,9, 3,2,1,  128, 8,12,15,0,4,7,  128, 8,15,11,0,7,3,   128,13,15,12,5,7,4,  128,13,14,15,5,6,7,  128,9,14,13,1,6,5,  128,9,10,14,1,2,6,  128,10,15,14,2,7,6,  128,10,11,15,2,3,7,  128,9,13,12,1,5,4,  128,9,12,8,1,4,0]"

                      +" }";
        
        return jsonMeshModel;
    }
}