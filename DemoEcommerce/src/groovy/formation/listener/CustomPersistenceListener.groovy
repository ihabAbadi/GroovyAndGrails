package formation.listener

import org.grails.datastore.mapping.core.Datastore
import org.grails.datastore.mapping.engine.event.AbstractPersistenceEvent
import org.grails.datastore.mapping.engine.event.AbstractPersistenceEventListener
import org.grails.datastore.mapping.engine.event.EventType
import org.springframework.context.ApplicationEvent


class CustomPersistenceListener extends AbstractPersistenceEventListener {

    protected CustomPersistenceListener(Datastore datastore) {
        super(datastore)
    }

    @Override
    protected void onPersistenceEvent(AbstractPersistenceEvent event) {
        switch (event.eventType) {
            case EventType.PreInsert:
                println("${event.entityObject}")
                break
            case EventType.PostInsert:
                println("${event.entityObject}")
                break
            case EventType.PreLoad:
                println("${event.entityObject}")
                break
        }
    }

    @Override
    boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        return true
    }
}
