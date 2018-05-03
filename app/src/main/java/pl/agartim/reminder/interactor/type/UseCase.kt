package pl.agartim.reminder.interactor.type

/**
 * Created by artur on 03.05.18.
 */
interface UseCase<T> {
    fun execute(): T
}