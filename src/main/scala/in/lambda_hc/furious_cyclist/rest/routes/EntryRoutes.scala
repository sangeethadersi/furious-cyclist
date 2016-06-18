package in.lambda_hc.furious_cyclist.rest.routes

import com.google.inject.Inject
import in.lambda_hc.furious_cyclist.rest.handlers.DefaultApiHandler
import in.lambda_hc.furious_cyclist.rest.handlers.complaints.RegisterComplaintHandler
import io.undertow.server.handlers.PathHandler

/**
  * Created by vishnu on 18/6/16.
  */
class EntryRoutes @Inject()(
                             defaultApiHandler: DefaultApiHandler,
                             registerComplaintHandler: RegisterComplaintHandler
                           ) {

  val pathHandler: PathHandler = new PathHandler()
    .addExactPath("/", defaultApiHandler)
    .addExactPath("/register", registerComplaintHandler)

}
