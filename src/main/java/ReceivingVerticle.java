import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.eventbus.EventBus;

/**
 * Created by pierre on 3/5/17.
 */

public class ReceivingVerticle extends AbstractVerticle {

    @Override
    public void start(Future<Void> fut) {
        EventBus eb = vertx.eventBus();

        eb.consumer("in", message -> {
            System.out.println("I have received a message: " + message.body());
        });
    }
}