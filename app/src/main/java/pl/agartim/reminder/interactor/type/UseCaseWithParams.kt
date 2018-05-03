package pl.agartim.reminder.interactor.type

/**
 * Created by artur on 03.05.18.
 */
interface UseCaseWithParams<P, T> {
    fun execute(parameter: P): T
}